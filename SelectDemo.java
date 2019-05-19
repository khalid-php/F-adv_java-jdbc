/* the program is the use of the select query is the use
*/
import java.sql.*;
public class SelectDemo {
	public static void main(String ar[])throws SQLException {
		//register the driver 
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//esblish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//creat statement by using 
		Statement st=con.createStatement();
		//execute the query 
		ResultSet rs=st.executeQuery("select * from khalid");
		rs.next();
		System.out.println(rs); 
	}
}