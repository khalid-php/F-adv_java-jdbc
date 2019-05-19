/* To estblish a connection with the database server we have to user 
getConnection().the getConnect() is a static method availbale in 
DriverManager class and therefore getConnection() can be invoke 
directly;
	DriverManager.getConnection();
	getConnection(url string,username string,string password);
	getConnection(url,username,pwd);
	getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","hussain");
	The getConnection returns an object of the connection.

	To Establish the connection with the databse server;

*/
import java.sql.DriverManager;
import java.sql.SQLException;
public class EstablishDemo {
	public static void main(String ...ar)throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		System.out.println("connection is the establish ");
	}
}