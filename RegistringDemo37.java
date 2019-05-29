/* Registering a Driver by predefined system propetty class
jdbc.driver;
*/
import java.sql.*;
public class RegistringDemo37 {
	public static void main(String arg[]) throws SQLException {
		//1. registring the driver manager
		//.Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//execute the query 
		st.executeUpdate("insert into khalid values(191,'sarsawti',52.8)");
		//close the connection
		con.close();
		System.out.println("record........");

	}
}
/* in the above program we did not specify the step 1.To establish
the connection we use getConnection().The getConnection() belongs
to DriverManager class .when to execute the getConnection(),the 
DriverManager class has to be loaded. when the DriverManager class
is loaded,the static block of that class will be executed. the static
block of the DriverManager class contains the logic to read
the predefined sytem property called jdbc.driver and register
the driver.
public class DriverManager {
	static {
	String driver=System.getProperty("jdbc.driver");
	Class.forName(driver);
	}
}  