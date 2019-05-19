/* executing a non select query (inserting a record )

*/
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class InsertRecord {
	public static void main(String arg[])throws SQLException{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		Statement st=con.createStatement();
		st.executeUpdate("insert into khalid values(123,'khalid',3000)");
		st.executeUpdate("insert into khalid values(124,'gagana',1000)");
		System.out.println("record sucessfully");
		
	}
}