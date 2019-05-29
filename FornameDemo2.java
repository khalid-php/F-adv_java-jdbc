/* Registring a Driver by using Class.forName() by reading data
from keyboard 
*/
import java.sql.*;
import java.io.*;
//the class the name
public class FornameDemo2 {
	//main method 
	public static void main(String ar[]) throws Exception{
		//inter the keyboad the by using
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter driver :-");
		String driver=br.readLine();
		System.out.println("Enter the url :-");
		String url=br.readLine();
		System.out.println("user name:-");
		String usr=br.readLine();
		System.out.println("user password:-");
		String pwd=br.readLine();
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,usr,pwd);
		Statement st=con.createStatement();
		st.executeUpdate("insert into test5 values(144,'divya kumari','shivnagar')");
		con.close();
		System.out.println("record insert .......");
	}
}