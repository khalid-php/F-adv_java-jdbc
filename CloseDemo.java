/* closing the database Connection
When we establish a connection to the database server by using 
getConnection(), a physical connection will be established
between the server and JDBC program.
After the connection is established we can perform operation
on the database server After all the operation on database 
server are done then we need to release the connection To.
we use close().
con.close();
Once the connection is release we cannot perform any other 
operations on the database server.
*/
import java.sql.*;
//class name
public class CloseDemo {
//main method
	public static void main(String ar[])throws SQLException {
		//register the driver with the DriverManager
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//establish the connection with the database server.
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//creating the statement
		Statement st=con.createStatement();
		//execute the query 
		ResultSet rs=st.executeQuery("select * from emp");
		//print the record
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		con.close();
	}
}