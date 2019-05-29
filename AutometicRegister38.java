/* automatic Registeration of the Driver
*/
import java.sql.*;
public class AutometicRegister38 {
	public static void main(String ar[])throws Exception {
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//execute the query
		st.executeUpdate("insert into test3 values(145,'jamal khan')");
		//close the connection
		con.close();
		System.out.println("record000....");
	}
}