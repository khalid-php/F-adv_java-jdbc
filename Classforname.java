/* Registering a driver by a using Class.ForName() by using properies
file .*/
import java.sql.*;
import java.io.*;
import java.util.*;
public class Classforname {
	public static void main(String ar[]) throws Exception {
		FileInputStream fis=new FileInputStream("application.properties");
		Properties pr=new Properties();
		pr.load(fis);
		String driver=pr.getProperty("driver");
		String url=pr.getProperty("url");
		String user=pr.getProperty("username");
		String pass=pr.getProperty("password");
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		st.executeUpdate("insert into test5 values(14,'bdg','hai')");
		con.close();
		System.out.println("record............");

	}
}