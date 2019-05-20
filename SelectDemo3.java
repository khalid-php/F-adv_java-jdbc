/** the program is the use of the select query with the use of the use
of the select query 
when we are retriving the data from a specified record.if we know
the type of the column we are retriveing then we specify getxxx().
but we if do not know the type of the column we are retrieving
then we can use getString().
getString(String columnName)
getString(int columnIndex)
The getString() will convert any kind of data into String format.

*/
import java.sql.*;
public class SelectDemo3 {
	public static void main(String ar[]) throws SQLException {
		//register the driver from driver manager class
		Driver d=new oracle.jdbc.driver.OracleDriver();
		//Establish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement 
		Statement st=con.createStatement();
		//execute query and ResultSet object 
		ResultSet rs=st.executeQuery("select * from khalid");
		//access and loop object the create
		while(rs.next()) {
			//read the value from getxxx()
			System.out.println(rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(1));
		}

	}
}  