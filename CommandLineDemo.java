/* the Registring a Driver by using Class.forName() by using command
line argument.
*/
//package name
import java.sql.*;
//class name with public keyword
public class CommandLineDemo {
	//main method 
	public static void main(String ar[]) throws Exception {
		//registring the driver for Class.forName(arg) class using
		Class.forName(ar[0]);
		//Establish the connection
		Connection con=DriverManager.getConnection(ar[1],ar[2],ar[3]);
		//create Statement
		Statement st=con.createStatement();
		//execute the query by using executeUpdate();
		st.executeUpdate("insert into test5 values(120,'kajal singh','shahpur')"); 
		//close the connection
		con.close();
		System.out.println("record is insert........");
	}
} 
