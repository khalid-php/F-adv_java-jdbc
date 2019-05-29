/* A Transation is a set of sql queries that has to be executed as a single
unit.A Transaction is a set of sql queries where all the qureies 
have to be executed or none of them has to be executed.
We need to use transation management when we want a group ofthe 
sql quries to be executed together,which are dependent on each other.
The transation management in a jdbc program is implicit ie the 
moment the connection is establish,a transation will begin automatically.
Every transation will end or terminate with either a commit or rollback
operation. if a transaction ends with a commit then the transaction is a
sucess and all the changes done to the data will be made permanent
in the database server but if a transation ends with a rollback then
the transation is a failure and any change done to the data will be 
be removed or will not be made permanent into the database server.
Every query will be executed as a part of separate transation. if
the query is asucess then the transation will be committed and ifthe
query is a failure then the transation will be rollback.
it is the responsible of the database server to begine a transation 
the moment connection is the establish Onece the transation is either
committed or rollback then that transation ends. The meoment a 
transation ends another transation will begin automatically.
Transation--commit----->transation sucess
Transation ---------rollback--------->Transation failure
In a JDBC program whenever we perform any modification to the 
data in database server then those changes will be stored temporarily.
into sga memeory when a transaction is either commited or rolled back
then the jdbc driver will make all changes permanent or remove
all changes from beginning of the current transaction.
if the transation management is done by database server then it is said 
to be implicit transation management but if the transation 
management is done by the programmer then it is said to be explict
transation management.
Using the explicit transation management we can create unserdefined 
transation To start a userdefined transation we have to use setAutocommit().
con.setAutoCommit(boolen);
By default the value of the setutoCommit() is the true which we can 
makes transation management implicit.
if we want to have explicit transation management or userdefined
transation we need to specify the boolen values as false.
To end the userdefied transation we need to explicit call the 
folloing methods 
1.commit.
2rollback.

*/
//package import name
import java.sql.*;
import java.io.*;
//class name
public class TransactionDemo {
	//main method 
	public static void main(String ...ar)throws Exception{
		//enter the account for the keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the account: no");
		int faccno=Integer.parseInt(br.readLine());
		System.out.println("Enter the transfer amt account no");
		int taccno=Integer.parseInt(br.readLine());
		System.out.println("enter the amount");
		int amt=Integer.parseInt(br.readLine()); 


		//registring the driver manager
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Establish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//create the statement
		Statement st=con.createStatement();
		//execute the query 
		ResultSet rs=st.executeQuery("select * from sbibank");
		//balance inquery variable
		int bal1=0,bal2=0;
		
		while(rs.next()) {
			if(rs.getInt(1) == faccno)
				bal1=rs.getInt(2);
			if(rs.getInt(1) == taccno)
				bal2=rs.getInt(2);
		}
		con.setAutoCommit(false);
		System.out.println(faccno+" "+bal1);
		System.out.println(taccno+" "+bal2);
		st.executeUpdate("update sbibank set bal="+(bal1-amt)+"where accno"+faccno);
		st.executeUpdate("update sbibank set bal="+(bal2+amt)+"where accno="+taccno);
		con.commit();
		System.out.println("amount is transfered..");
		//close the conncetion
		con.close();
	}
}
 