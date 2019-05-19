/* if we require the data available in the object if we want to read
the data available in the object then it is the responsibility of the 
of the programmer to read the data from the object.
Query ----->Query------->Query is process
jdbc program<----- jdbc driver<------<-----<---database server
when a jdbc a program executes a select query,the query will be sent from the 
from the jdbc program to the jdbc driver.The jdbc driver will receive the query and send 
the sends the query to the database server. The database server
will receive the query,process the query,retrive the record and 
sends the record to the jdbc driver.
 when a jdbc program executed a select query will be sent from 
 the jdbc program to the jdbc driver.the jdbc driver will receive
 the query and sends the query to the database server. the database server
 will receive the query,process the query,retrives the record
 and sends the record to the jdbc driver.
 the jdbc driver will receive the records from the database server
 and convert them into the ResultSet object and then sends the resultSet object to the 
 jdbc program the jdbc program will always receive resultSet object
 containing the data given by the database server.
 it is the responsiblity of the programmer to read the data from 
 ResultSet object.Every Result Set object will be associated with a pointer
 called ResultSet pointer which will be by default positioned
 before the first record.
 As a programmer we have to move or place the ResultSet pointer
 to the appropriate record and the read the data from that record.
 To move the ResultSet pointer we hava to use next();
 boolean next()
 The next() will move the ResultSet pointer one step forward 
 from the current position.
 Once the ResultSet pointer is pointing to an appropriate record
 then we can read the data from record by using getxxx();
 getxxx(String columnName);
 getxxx(int columnIndex);
 */
 import java.sql.*;
 public class SelectDemo1 {
 	public static void main(String ar[])throws SQLException {
 		//the register the driver for drivermanager class
 		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
 		//establish the connection from 
 		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
 		//create the statement from the 
 		Statement st=con.createStatement();
 		//execute the query the create ResultSet object 
 		ResultSet rs=st.executeQuery("select * from khalid");
 		//move the ResultSet pointer
 		rs.next();
 		//read the record the data by using getxxx() using
 		System.out.println(rs.getInt("srno")+" "+rs.getString("sname")+" "+rs.getDouble("smark")); 
 	}
 }