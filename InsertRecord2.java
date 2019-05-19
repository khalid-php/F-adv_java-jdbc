/* executing a non select query inswrting multiples records
	through the scanner 
*/

import java.sql.*;
import java.util.*;
public class InsertRecord2 {
	public static void main(String arg[])throws SQLException {
		//register the oracle driver in jdbc program
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//establish the connection to the oracle driver
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement from
		Statement st=con.createStatement();
		//enter the record by the keyboard 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll ");
		int roll=sc.nextInt();
		System.out.print("Enter the name ");
		String name=sc.next();
		System.out.print("Enter marks ");
		double marks=sc.nextDouble();
		//execute the insert query and select query
		String query=("insert into khalid values("+roll+",'"+name+"',"+marks+")");
		st.executeUpdate(query);
		System.out.println(query);
		// create statement from 
		 Statement st1=con.createStatement();
		 String query1=("select * from khalid");
		 st1.executeQuery(query1);
		System.out.println("record is insert and select ");
	}
}