/* the Registring a Driver by using class using Class.forName().
*/
import java.sql.*;
//class name
public class FornameDemo1 {
	//main method
	public static void main(String a[]) throws Exception {
		//registring the driver by using the 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//execute the statement
		st.executeUpdate("insert into test3 values(111,'kkiol')");
		//close the connection
		con.close();
		System.out.println("insert the record....");
	}
}
