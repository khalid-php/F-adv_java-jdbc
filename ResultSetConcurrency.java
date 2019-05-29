/* if we specify the resultSetConcurrency as CONCUR_READ_ONLY, then
then we will be able to perform only reading or accessing the data
.CONCUR_READ_ONLY is the default values of ResultSetConcurrency. if we 
Want to read the data then we take the help of getxxx();
if we want to update the data available in the database server, then we need
to specify CONCUR_UPDATABLE. if we specify the resultSetConcurrency as CONCUR
_UPDATABLE then we can modify the data in the database server 
using the ResultSet object without writing any queries. using the 
updateble Result object we can perform only DML operation like insert
delete, update etc.
when we are performing update operation in the database server by 
using a updatable ResultSet object, then the select query must perform
projection insted of specfying * symbol.
1. performing delete operation.
Move the resultset pointer to the appropriate record that has to
be deleted.
rs.absolute(5);
Once the resultSet pointer is pointing to the appropriate record,
then we can delete that record by using deleteRow();
Exmple 
rs.absolute(5);
rs.deleteRow();
2. performing update operation
move the resultSet pointer to the appropriate record that has to be
used rs.absolute(5);
2.Once the resultSet pointer is pointing to the appropriate record
then we can update that record by using updatexxx();
udatexxx(String colunm);
3.Once the value are specified for the columns that are
to be updated,then use updateRow().
Note:-when we can update any number of the columns in the that record.
Example :
rs.absolute(5);
rs.updateString(2,"wxys");
rs.updateDouble("smarks",56.0);
rs.updateRow();
3.Performing insert operation
1.Move the resultset pointer to the insert mode by using moveToInsertRow()
2.Once the resultset pointer is placed in the insert mode,then we can
insert a record.
when we are inserting a record we need to specify values for all
Once the values for all the columns  are specifed then use insertRow().
we can specify the values in any order.
rs.moveToInsertRow();
rs.updateInt(1,12);
rs.updateString(2,"sppon");
rs.updateDouble(3,89.0);
rs.updateRow();
3. Performing insert opertation
1.Move the resultset pointer to the insert mode by using moveToInsertRow()
2.Onece the resultdet pointer is place in the insert mode,then
we can insert a record when we are inserting a record we need to 
specify values for all the columns in that table To specify a value
we use updatexxx().
updatexxx(string columnname,xxx value)
3.Once the values for all the columns are specified then use 
insertRow().
note we can specify the value in any order.
Example:
rs.moveToInsertRow();
rs.updateInt(1,12);
rs.updateString(2,"spnp");
rs.updatedouble(3,78.9);
rs.insertRow();
*/
//package name
import java.sql.*;
//class name 
public class ResultSetConcurrency {
	//main method
	public static void main(String ar[])throws SQLException{
		//registring the driver manager
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Establish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//execute the query
		ResultSet rs=st.executeQuery("select srno,sname,smark from khalid");
		
		//go to absulute value for the 
		rs.absolute(5);
		//delete the record
		rs.deleteRow();
		System.out.println("deleted the record.."); 

		//the go to absolute value 
		rs.absolute(9);
		//update the record
		rs.updateDouble(3,55.9);
		rs.updateRow();
		System.out.println("udate the record....");

		//insert  in the record
		rs.moveToInsertRow();
		rs.updateInt(1,29);
		rs.updateString(2,"ivrs");
		rs.updateDouble(3,1000);
		rs.insertRow();
		System.out.println("Insert the record+++"); 

		//close the connection
		con.close();

	}

}

