/* create the multiple query in the cmd promed
sql> create or replace procedure danish
   >as
   >begin
   >insert into test3 values(1,"kaka");
   >delete from test3 where sno=1;
   update test3 set name="kkkk" where sno=23;
   >end danish;
   /
   */
import java.sql.*;
import oracle.jdbc.driver.*;
//class name 
public class CallableDemo1 {
	//main method 
	public static void main(String arg[])throws SQLException {
		//registring the driver the drivermanager class
		DriverManager.registerDriver(new OracleDriver());
		//establish the connectio
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//use in the callable statement
		CallableStatement cst=con.prepareCall("{call muldemo}");
		//execute the callable
		cst.execute();
		//close the connecction 
		con.close();
	}
}