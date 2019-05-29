/* the use the query the  
*/
//package the name
import java.sql.*;
//class name
public class BatchDemo1 {
	//main method the 
	public static void main(String ar[])throws Exception{
		//registring the driver mnanager
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//add the addbatch
		st.addBatch("insert into test3 values(18,'moni')");
		st.addBatch("update test3 set name='haena' where sno='null'");
		st.addBatch("delete from test3 where sno=10");
		//the execute the 
		int[] res = st.executeBatch();
		System.out.println(res.length);
		//find the arr count
		for(int x:res) {
			System.out.println(x);
		}
		con.close();
	}

}