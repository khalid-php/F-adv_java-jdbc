/* The above program will read only one record display.if we want to 
retrive all record from the table,we need to use a loop
*/
import java.sql.*;
public class SelectDemo2 {
	public static void main(String ar[])throws SQLException{
		//register the driver 
		Driver d=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		//establish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//execute the query using resultset object
		ResultSet rs=st.executeQuery("select * from khalid");
		//access the all record from the the table and loop 
		while(rs.next()) {
			System.out.println(rs.getInt("srno")+" "+rs.getString("sname")+" "+rs.getDouble("smark"));
		}
	}

}