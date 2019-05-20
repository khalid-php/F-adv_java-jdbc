/* The process of the selection can contain multiple 
condition.
executing a select query.
*/
import java.sql.*;
public class SelectDemo6 {
	public static void main(String ar[])throws SQLException{
		//Register the driver 
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Establish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//execute the the query
		ResultSet rs=st.executeQuery("select * from khalid where smark>=20 AND smark<=100");
		//execute the query and the access the record
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString("smark"));
		}
	}
}
