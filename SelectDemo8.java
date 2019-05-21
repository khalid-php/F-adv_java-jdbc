/* when we are accessing the data by using getxx().or getString
we can specify the column index the column index value has to 
specifed according to the data avaible in the ResultSet object
and the index start from 1.
In a single query we can perform both selection and projection.

*/

import java.sql.*; //package name
import oracle.jdbc.driver.*;
//class name
public class SelectDemo8 {
//main method 
	public static void main(String ar[])throws SQLException {
		//register the driver
		DriverManager.registerDriver(new OracleDriver());
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		 //create the Statement
		Statement st=con.createStatement();
		 //execute the query and create result set object 
		ResultSet rs=st.executeQuery("select srno,smark from khalid where smark >=1000");
		//object the query
		while(rs.next()) {
			//print the query
			System.out.println(rs.getInt(1)+" "+rs.getDouble(2));
		}
	}
}
