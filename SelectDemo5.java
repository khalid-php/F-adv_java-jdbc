/* Selection -It is a process of reading or accessing particular
records from a table based on a condition.
executing a select query

*/
import java.sql.*;
import oracle.jdbc.driver.*;
public class SelectDemo5 {
	public static void main(String ar[])throws SQLException{
		// register the driver
		DriverManager.registerDriver(new OracleDriver());
		//establish the connction
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//Create the Statement
		Statement st=con.createStatement();
		//execute the Query 
		ResultSet rs=st.executeQuery("select * from khalid where smark <60.90");
		//retrive the data from the loop from 
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString("smark"));
		}

	}
} 