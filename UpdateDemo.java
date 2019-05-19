 /* the query use of the non select query updating a record.
 */
 import java.sql.DriverManager;
 import java.sql.Connection;
 import java.sql.Statement;
 import java.sql.SQLException;
 public class UpdateDemo {
 	public static void main(String ar[])throws SQLException{
 		//register the driver
 		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
 		//establish the connection 
 		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
 		//create the statemet
 		Statement st=con.createStatement();
 		//execute the query 
 		st.executeUpdate("update khalid set smark=50 where srno=3");
 		System.out.println("record is update ");
 	}
 } 