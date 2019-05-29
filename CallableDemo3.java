/* create or replace procedure addition(fno in number,sno in number,tno out number)
as 
begin
tno:=fno+sno;
end addition;
/
Excuting the procedure in the sql command prompt;
variable res number;
exec addition(10,20:res);
print res;

executing a procedure with input and output parameter
*/
//package name
import java.sql.*;
import oracle.jdbc.driver.*;
//class name
public class CallableDemo3 {
	//main method
	public static void main(String ar[])throws SQLException {
		//registring the driver manager
		DriverManager.registerDriver(new OracleDriver());
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//statement the query the executable
		CallableStatement cst=con.prepareCall("{call addition(?,?,?)}");
		//set the values
		cst.setInt(1,12);
		cst.setInt(2,-9);
		cst.registerOutParameter(3,Types.NUMERIC);
		cst.execute();
		int sum=cst.getInt(3);
		System.out.println("result: "+sum);
		//close the connectionl;
		con.close();	
	}
}