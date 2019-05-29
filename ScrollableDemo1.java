//package 
import java.sql.*;
//class the name
public class ScrollableDemo1 {
	//main method 
	public static void main(String ar[])throws Exception{
		//register the driver 
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//execute the query
		ResultSet rs=st.executeQuery("select * from test4");
		rs.next();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getString(3));
		//goto the relative function
		rs.relative(2);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getString(3));
		//rs.beforeFirst();
		//System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getString(3));
		rs.getRow();
		//rs.relative(-3);
		System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
		//rs.refreshRow();
		//System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));


		//rs.afterLast();
		//System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));

	}
}
