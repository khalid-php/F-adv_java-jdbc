/* registring a driver by using Class.Name() by using system properties
*/
import java.sql.*;
public class CommandLineDemo1 {
	public static void main(String arg[]) throws SQLException, ClassNotFoundException {
		String driver = System.getProperty("drv");
		String url = System.getProperty("url");
		String user = System.getProperty("usr");
		String pass = System.getProperty("pwd");
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		st.executeUpdate("insert into test5 values(200,'kkkk','gggg')");
		con.close();
		System.out.println("record..........");

	}
}