/* the reading an image a table 
*/

import java.sql.*;
import java.io.*;
//class name
public class ReadImage44 {
	//main method
	public static void main(String ar[]) throws Exception{
		//registering the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the create 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//execute the query
		ResultSet rs=st.executeQuery("select * from employee1 where id=45");
		//file the input the record the data
		FileOutputStream fos=new FileOutputStream("test.jpg");
		if(rs.next()) {
			fos.write(rs.getBytes(2));
		}
		con.close();
		System.out.println("record image.........");
	}
}
