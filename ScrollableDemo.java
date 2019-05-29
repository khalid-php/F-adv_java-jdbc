/* Scrollable and update ResultSet
to create a statement object, we use createStatement(). when we use
createStatement(),then we get a statement object Using that if we 
execute a select  query,them if we execute a select query.then
we get execute a select query, when we get a resultSet object 
which is non scrollable and updatable.
if we want to acess the data in both the directions or access the
data in random order and if we want to update the data in the 
database server without using queries then we need to create a 
scrollable and updatable ResultSet
if we want to create a scrollable and updateble ResultSet then we have
to execute the select query by using the Statement object 
which is returned by createStatement() with two parameters.
createStatent(int resultType,int resultSetConcurrency)
resultSetType parameter specifes whether resultSet object is 
scrollable or not and the parameter resultSetConcurrency specifies
whether the ResultSet object is updatable or not
To specify resultSetType and resultSetConcurrency,we have a set
of predefined constant
available in ResultSet interface.
the ResultSet interface provides 3 constant for resultSetType and they are
1.TYPE_FORWARD_ONLY
2.TYPE_SCROLL_INSENSITIVE
3.TYPE_SCROLL_SENSITIVE
the ResultSet interface provides 2 constant for resultSetConcurrency
and they are 
1.CONCUR_READ_ONLY
2.CONCUR_UPDATABLE
ResultSet type
if we specify the resultSetTypes as TYPE_FORWARD_ONLY then will
create a non scrollable object where we can access the data only forward direction.
TYPE_FORWARD_ONLY is the defult ResultSet type 
if we specify the resultSetType as TYPE_SCROLL_INSENSITIVE or
TYPE_SCROLL_SENSITIVE,then it will create a scrollable ResultSet
object,using which we can access data in both forward  and backward
directions and we can access the data in random order
if we specify the resultType as TYPE_SCROLL_INSENSITIVE then 
we will not receive the modified data done by the other progeramming
when we specify TYPE_SCROLL_INSENSITIVE, then it represents a snapshot of the data 
avaiable in the database server during the query.
execute time.After we receive the ResultSet object and before 
we read the data from the resultSet object if there any modification
done to the data in database 
saerveer by the other programmer then it will not be reflected in the 
ResultSet object we have
if we specify the resultSetType as TYPE_SCROLL_SENSITIVE,then we receive
a ResultSet object containing a set of pointer which are refering
to the records in the database server that are matching according 
to specified query criteria after we receive the ResultSet object
and before we read the data if there is any modification done to the 
data in database server by other programmer then it will be reflected
in the ResultSet object we have,The set of pointer available in 
the pointer indexed column available in the table.When we are specified
TYPE_SCROLL_SENSITIVE as the resultType the the table when we are
must have a primary key and it should be part of the query.
Methods related to scrollable ResultSet:
absolute(int row):This method will move the Resultset pointer at
the specifed row.
first():This method will place the ResultSet Pointer at the first record.
last():This method will place the ResultSet Pointer at the last record.
next():This method will move the cursor one step forward from 
the current position.
previous(): This method will move the cursor one step backward from
the current position.
relative(int count):-This method will move the cursor either 
forward or backward relative to the current position based on the 
count specifed.
beforeFirst():This method will move the cursor after the first record.
afterLast(): This method will move the cursor after the last record.
getRow(): This method will return the current position of the last record.
refreshRow(): this method can be used to refresh the content of the record
reading from the database server.
note-: The refreshrow() has to be used when we specify the resultSet type 
as TYPE_SCROLL_SENSITIVE
*/
import java.sql.*;//pakage 
//class name
public class ScrollableDemo {
//main method
	public static void main(String ...ar) throws SQLException {
		//Register the deriver manager
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//establish the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//creating the statement
		Statement st=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//creat the resultset object exeute the query
		ResultSet rs=st.executeQuery("select * from khalid");
		//go to absolute location.
		rs.absolute(4);
		//display the record
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getDouble(3));
		//first location
		rs.first();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getDouble(3));
		//go to last record
		rs.last();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getDouble(3));
		//go to next step from the current location
		
		//go to previouse the one step backward
		rs.previous();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getDouble(3));
		
		

		//close the connection
		connection.close();
	}
}


