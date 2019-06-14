/* DatabaseMetaData object the can be used to find the details of the 
the database,deiver,username and password.
To get the DatabaseMetaData object we use getMetaData(). The getMetaData()
belongs to connection interface.
Database metabase:-> DatabaseMetaData object can be used to for accessing the information
of data base name version username,url,connection etc.
To get the database metabase object we need to getMetaData()
available in connection.
Method related to DatabaseMetaData:
int getDatebaseMajorVersion().
int getDatebaseMinorVersion().
String getDatabaseProductName().
String getDriverMajorVersion().
int getDriverMinorVersion().
String getDriverName().
String getDriverVersion().
int getJDBCMajorVersion().
int getJDBCMinorVersion().
String getURL().
String getUserName().
*/
import java.sql.*;
public class MetaDataDemo47 {
	public static void main(String ar[]) {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		DatabaseMetaData dbmd=new con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
	}
}
