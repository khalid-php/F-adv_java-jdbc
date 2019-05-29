/* Batch Execution - A batch is a group of sql queries. batch execution
is a process of sending multiple queries to the database server at a time
in the form of the a batch group and then executing them in the 
database server;
method realted to batch executed
void addBatch(string query):this method can be used to place the specified
query into the batch.
int [] executeBatch(): this method can be uesd for execuiting all
queries avaliable in the batch.
note: the return type of execution batch in int[] and the length
of the will be equal to number of queries available in the batch 
Every value in int[] will represent the number of the records modifed 
in the database server by the corrosrponding query.
void clearBatch() this method can be used to remove all the queries avaliable in the 
batch.
we can improve the performance of the jdbc program in the following ways
1.by using the Batch execution.
2. by using preparedStatement.
3.by using callableStatement
The Callable Statement is used for the executing a procedure or a function.
The logic specified in the procedure or a function will be available
in the database server.As a developer we do not want to specify
the logic in the database server and the syntax of the procedure 
may vary from database to database and therefore we are recommended
not use procedure or not to depend on procedure in the a jdbc program.
The PreparedStatemnt can improve the performance,only if we are 
executing the same query multiple times.if we are exexuting a query
only one time and if we are executing different queries then PreparedStatement
will not imporve any performance.
The process of the batch execution will improve the performance 
even if the execute different queries then Prepared Statement will
not improve any performance.
The process of the batch execution will improve the performance any performance
even if we execute diffrent queries by the sending all of them
as a single request in the form of the of the a batch to database
server and thereby reducing the network load.
The process of the batch execution can execute only DML queries.
The process of batch execution can be applied to both Statement
and PreparedStatement.
Difference Between PreparedStateemnt and Batch Execution
1.The PreparedStatement will improve the performance
by reducing the execution time of the query in the database server.
The PreparedStatement will improve the performance only if we are executing
the same query query multiple times.
Using the preparedStatement we can execute any kind of the query.
In the PreparedStatement the number of the request made to database
server will be equal to the number of the number of the queries executed.
In PreparedStatement the number of the request of the request made to the 
database server will be equal to the number of the number of the queries
executed.
//Batch
The batch execution will imporove the performane by reducing the load
on the network.
In batch execution the perforamnce will be improved whether the 
queries are same or different.
using batch execution we can execute only DML queries.
In batch execution the number of the request made to database 
server will be only one irrespective of he number of the number
of the queries executed.

/* executing the a batch query.
*/
import java.sql.*;
//package name
public class BatchDemo {
//class name
	public static void main(String ar[]) throws SQLException{
		//main method is the 
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//registing the driver
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//Esblish the connection 
		Statement st=con.createStatement();
		//create the statement
		st.addBatch("insert into test3 values(11,'kajal')");
		st.addBatch("insert into test3 values(12,'rima')");
		st.addBatch("insert into test3 values(13,'sima')");
		st.executeBatch();
		//execute the query
		con.close();
		//close the connection  
	}
}    
