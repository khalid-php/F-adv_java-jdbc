/* 
In order to exceute the query in the three statement
1 statement
2 preparedstatement
3 callable statement
Stateemnt and preparedStatement are used for excuting basic queries whereas 
CallableStatent will be used for executing procedure or function.
3. To create the stateemnt object we use createStatement(). which is an 
is an instance method connection interface To invoke 
createStatement()  we require an object of con.createStatement();
Statement st=con.createStatement();

*/

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class StatementDemo {
	public static void main(String ...arg)throws SQLException{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		Statement st=con.createStatement();
		System.out.println("stateemnt is created ");
	}
}
