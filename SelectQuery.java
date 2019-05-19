/* The queries with respect to java language are are classified into two types;
1.select queries.
2.non-select queries
1.To execute a select query we use executeQuery()
	ResultSet executeQuery(String query)
2.To execute a non select query we use executeUpdate()
	int executeUpdate(String query)

*/

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class SelectQuery {
	public static void main(String arg[])throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		Statement st=con.createStatement();
		st.executeUpdate("create table khalid(srno number(4),sname varchar2(10),smark number(6,2))");
		System.out.println("table is created ");
	}
}
