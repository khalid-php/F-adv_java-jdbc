/* Alias Name : Alias name is an alternate name given to a particular
column in the ResultSet object.
Alias name can be given to a particular column,when we are 
performing projection.An alias name can be specified to any
number of columns.
*/
//package name
import java.sql.*;
import oracle.jdbc.driver.*;
//class name
public class SelectDemo9 {
	//main method the use
	public static void main(String ar[])throws SQLException{
		//register the driver
		DriverManager.registerDriver(new OracleDriver());
		//Establish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create statement
		Statement st=con.createStatement();
		//executing the query use the alias name
		ResultSet rs=st.executeQuery("select srno rollno,sname from khalid where smark>=200");
		//query print through loop
		while(rs.next()) {
			System.out.println(rs.getInt("rollno")+" "+rs.getString("sname"));
		}
		con.close();

	}
}

/* when we are accessing the data from the database,will be
specifying table names,column names in the query.The table names
and the column names that we specify in the jdbc program as part
of the query are insentive i.e we can specify them in any case.
*/

