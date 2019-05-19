/* executing a non select query(inserting a record by reading the data from keyboard);
*/
import java.sql.*;
import java.io.*;
import oracle.jdbc.OracleDriver;
import java.sql.SQLException;
public class InsertRecord1 {
	public static void main(String ar[])throws SQLException,IOException {
		Driver d=new OracleDriver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll no");
		int srno=Integer.parseInt(br.readLine());
		System.out.println("Enter name : ");
		String sname=br.readLine();
		System.out.println("Enter marks ");
		double smarks=Double.parseDouble(br.readLine());
		String query=("insert into khalid values("+srno+",'"+sname+"',"+smarks+")");
		st.executeUpdate(query);
		System.out.println(query);
		System.out.println("reocrd is sure");
	}
}
