/* Projection :- It is process reading or accessing few columns from table
The projection can be done for all the columns or any number
of columns and the the projection can be done in any order.
executing a select query 
*/
import java.sql.*;
import oracle.jdbc.driver.*;
public class SelectDemo7 {
	public static void main(String ar[])throws SQLException{
		//registering the driver
		DriverManager.registerDriver(new OracleDriver());
		//Establish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement 
		Statement st=con.createStatement();
		//execute the query 
		ResultSet rs=st.executeQuery("select sname,srno from khalid");
		//record the access the particular
		while(rs.next()) {
			System.out.println(rs.getInt("srno")+" "+rs.getString("sname"));
		}
	}
}

