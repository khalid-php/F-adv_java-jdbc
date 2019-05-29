/* java language contains two date class
1.java.util.Date
2.java.sql.Date
1.The java.util.Date class should be used to when to want to perform date
operation java.util.Date d=new java.util.Date();
java.util.Date d=new java.util.Date(long millisecond);
2.java.sql.Date - should be used when to perform date operation 
with respect on the database
java.sql.Date
java.sql.Date d=new java.sql.Date(long millisecond);
*/

import java.sql.*;
import java.util.*;
import java.text.*;
//class name
public class DateDemo45 {
	public static void main(String ar[])throws Exception,ClassNotFoundException{
		//registering the driver manager
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement by using prepared statement
		PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee number: ");
		int id=sc.nextInt();
		
		System.out.println("Enter the employee name: ");
		String name=sc.next();
		
		System.out.println("Enter the employee dob :");
		String dob=sc.next();
		
		java.util.Date udate1=new java.util.Date();
		long ms1 = udate1.getTime();
		java.sql.Date sdate1=new java.sql.Date(ms1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
		
		java.util.Date udate2=sdf.parse(dob);
		long ms2 = udate2.getTime();
		java.sql.Date sdate2=new java.sql.Date(ms2);
		
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setDate(3,sdate1);
		pst.setDate(4,sdate2);
		pst.executeUpdate();
		System.out.println("record is inserted in datanase");
		con.close();
	}
}
