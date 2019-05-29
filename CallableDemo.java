/* CallabeStatement :- The CallableStatement can be used to call 
or execute a procedure or a function from a jdbc program.
in a jdbc program we can send any number of queries to the database
server and execute them.Every query will be sent to the database
server as a separate request.if the jdbc program contains multiple
queries then mutiple request will sent to the database server 
if multiple request are sent from the jdbc program to the database
server,then then there will be increase in the load on the network
.In order to reduce the load on the network,we take the help of the 
procedure A procedure is a set of sql queries and it can even 
contain some business logic. The procedure resides in the database
server and executes in the database server.
Syntax creating a procedure:
create or replace procedure procedure_name
as 
begin
statement;
sql queries;
business logic;
end procedure_name;
example -: procedure with a single query
create or replace procedure myproc
as begin 
insert into student values(24,'abc',56.8);
end myproc;
To jdbc program is use to execute a prodcedure we use prepareCall()
Procedure to use CallableStatement.
1.Registering the Driver with DriverManager.
2.Establishing the connection with the database server.
3.creating the callableStatement by using 
The preparedcall() required one parameter of string type.
4.setting the values values for all the positional by using 
setxxx() if avaible setxxx(int positionalparameterindex,xxx value);
execute the procedure by using execute()
closing the  connection by using close();

*/
//import java
import java.sql.*;
import oracle.jdbc.driver.*;
//public is class name
public class CallableDemo{
	//main method to call the all method
	public static void main(String ar[]) throws SQLException{
		//registering the driver with drivermanager
		DriverManager.registerDriver(new OracleDriver());
		//Establish  the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the callablestatement by using preperd call
		CallableStatement cst=con.prepareCall("{call raja}");
		//execute the query
		cst.execute();
		con.close();
	}
}
