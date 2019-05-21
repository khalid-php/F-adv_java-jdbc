/* PreparedStatement the Statement and PreparedStatement are
used for executing the basic but the PreparedStatement
will improve the performance of the application executing the 
reduce time execution.
Procedure to use PreparedStatement.
1.Registering the driver with the DriverManager.
2.Establish the connection with the database server.
3.Creating the PreparedStatement by using PrepareStatement
the prepareStatement() requires one parameter of string type
which is a query along with positional parameters(?).
4.Setting the values for all the positional parameters by 
using setxx() if available setxxx(int positionlParameter,xxx value);
setxxx(int positonalParameterIndex,xxx value)
5.executing the queries either by using executeUpdate() or 
executeQuery().
6.closing the connection by using close().
inserting a record by using preparedstatement
*/
//package name
import java.sql.*;
import oracle.jdbc.driver.*;
//class name
public class PreparedStatementDemo {
	//main method
	public static void main(String[] args) throws SQLException {
		// register the driver with the driver manager.
		DriverManager.registerDriver(new OracleDriver());
		//Establish the connection the with database server
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement by using PreparedStatement();
		PreparedStatement pst = con.prepareStatement("insert into khalid values(?,?,?)");
		//set the value with the position
		pst.setInt(1,40);
		pst.setString(2,"kajal");
		pst.setDouble(3,23.3);
		pst.executeUpdate();
		System.out.println("Values Inserted");
		con.close();
	}
}
/* when a query is compiled,the entire query will be compiled 
except the positional parameters we will have a partial compiled 
query.
when the query is compiled,the database server will create a variable
called bind variable.for every positional parameter a bind variable
will be created.Every positional parameter will be binded variable
before we execute the query,we have to set the value for the positinal
parameter.when the values for postional parameter are set,those values
will be store into the bind variables.when a query is executed 
we use partial compiled query along with bind variables.
Syntax 
variable variablename datatype
variable rno number
Syntax for the setting a value into a variable
execute:variablename:=value;
execute:rno:=12;
Syntax for printing the value of the a variable
print variablename;
print rno;
Procedure followed by preparedStatement to execute a query:
step 1:-storing:-when a query is sent to the database server it will
verify whether the query is already existing in the database 
server cache memory or not.if the query is not available,then
query will be stored into the cache memory otherwise it will 
perform the last step(step7);
step 2:-The database server will verify whether the syntax of the
query is valid or not .
step 3:- The database server will verify whether the objects required
step 4:- The database server will convert query into database
understandable format(compilation).
step 5:- The database server will generate multiple algorithms which
are required for retrieving or perform on the data in the 
database server.
step:-6-All the generated algorithms and the compiled query will
be stored into shared pool.
Step 7:-The database server will up an appropriate algorithms 
according to the current situation and the execute the query.
*/
