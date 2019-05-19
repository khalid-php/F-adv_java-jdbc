/* the executing a non select query (deleting a record)
*/
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class DeleteDemo {
	//main method
	public static void main(String ar[]) throws SQLException {
		//register driver 
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//establish the connection
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create statement
		Statement st=con.createStatement();
		//execute the query
		int sql=st.executeUpdate("delete from khalid where srno=3");
		if((sql) == 1)
			System.out.println("record is deleted");
			else
			System.out.println("record is denided "); 
	}
}