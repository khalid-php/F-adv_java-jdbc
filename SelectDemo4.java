/* The getString() will convert any kind of the data into String formate
executing a select query
*/
import java.sql.*;
public class SelectDemo4 {
	public static void main(String ar[])throws SQLException{
		//register the driver 
		Driver d=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		//Establish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create Statement
		Statement st=con.createStatement();
		//execute the query
		ResultSet rs=st.executeQuery("select * from khalid");
		//the create the create the ResultSet the object
		//access the object
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString("smark"));
		}
	}
}
