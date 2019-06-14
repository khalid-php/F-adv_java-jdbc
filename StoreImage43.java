/* Storing and Reading an image.
Database is used for storing data in the form of table.A table can
contain any kind of the data. To store huge amount of data, we use 
blob or clob types.
This datatype can used for storing a huge data.
*/

import java.sql.*;
import java.io.*;
//class name
public class StoreImage43 {
	//public main method
	public static void main(String ar[]) throws Exception {
		//registring the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//prepared Statement
		PreparedStatement pst=con.prepareStatement("insert into employee1(id,mydp) values(?,?)");
		//executed
		pst.setInt(1,45);
		FileInputStream fis=new FileInputStream("download.jpg");
		//set the value
		pst.setBlob(2,fis);
		pst.executeUpdate();
		con.close();
		System.out.println("record the image......");
	}
}
