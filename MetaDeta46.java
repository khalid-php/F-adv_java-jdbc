/* MetaData : Metadata provides data about the data .
in the jdbc in we have three type of the method method data 
1.ResultSetMetaData
2.DatabaseMetaData
3.parameterMetaData
ResultSetMetaData :-
ResultSetMetadata :->ResultSetMetaData object can be used to get the information
about the number of columns,types and properies of the columns in a 
ResultSet object.
To get the ResultSetMetaData object we use getMetaDate(). The getMetaDate()
belongs to ResultSet.
ResultSetMetaData rsmd=new rs.getMetaData();

Methods related to ResultSetMetaData;
1.int getColumnCount().
2.String getColumnLabel(int column).
3.String getColumnName(int column).
4.int getColumnType(int column).
5.String getColumnTypeName(int column).
6.int getPrecision(int column).
7.int getScale(int column).
8.String getTableNamae(int column).
9.String getSchemaName(int column).

*/
import java.sql.*;
//class name
public class MetaDeta46 {
	//main method
	public static void main(String ar[])throws Exception {
		//registering the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//execute the query
		ResultSet rs=st.executeQuery("select *from khalid");
		//result the query
		ResultSetMetaData rsmd=rs.getMetaData();
		//count the object
		int count=rsmd.getColumnCount();
		System.out.println(count);

		for(int i=1;i<=count;i++) {
			System.out.println(rsmd.getColumnName(i));
			System.out.println(rsmd.getColumnLabel(i));
			System.out.println(rsmd.getColumnTypeName(i));
			System.out.println(rsmd.getPrecision(i));
			System.out.println(rsmd.getScale(i));
		}
		con.close();
		System.out.println("record is the display");
	}
}
