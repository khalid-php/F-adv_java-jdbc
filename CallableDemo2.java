/* A procedure can have parameters. The parameters of the a procedure
are classifed into 2 types and they are:-
1.Input parameter : the input parameters of the a procedure 
will be represented by "in".
2.output parameter the output parameter will be represented 
by "out"
A procedure can contain any number of input parameter and any number of output
parameter.
Syntax procedure with parameter.
create or replace procedure procedure_name(parameters)
as 
begin
sql queries
business logic
end procedure_name;
/
create or replace procedure insproc(pno in number,pname in varchar,pmarks in number)
as
begin
insert into student values(pno,pname,pmarks);
end inspro;
/
*/
//package the import
import java.sql.*;
import oracle.jdbc.driver.*;
//class name
public class CallableDemo2 {
	//main method
	public static void main(String ar[])throws SQLException {
		//registring the driver manager
		DriverManager.registerDriver(new OracleDriver());
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the Callable statement
		CallableStatement cst=con.prepareCall("{call indemo(?,?,?)}");
		//execute the queries set the values
		cst.setInt(1,28);
		cst.setString(2,"hana");
		cst.setString(3,"gajiyabad");
		//execute the query
		cst.execute();
		//close the connection
		con.close();

	}

}