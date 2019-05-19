/* 1.Registration a Driver with the DriverManager
method - DiverManager.registerDriver();
To register a Driver with the DriverManager we have to use registerDriver() method.
the registerDriver() is the static method available in DriverManager class
and therefore registerDriver() can be invoked directly by using class name.
DriverManager.registerDriver();
The registerDriver() expects one parameter of Driver object. Driver 
is an interface whose object cannot be instantiatede(cannot make object)
and therefore we take the help of the implementation of Driver interface
the implementation class of Driver interface with respect to oracle
database  is OracleDriver.all the class developed by the databse vendors
will be provided in  the form of jar files.

the OracleDriver class is available in oracle.jdbc.driver package 
which is released as part of a jar files. with respect to oracle
database we need to use ojdbc14.jar.

JDBC Driver is a software component that enables java application to interact with the database. There are 4 types of JDBC drivers:
JDBC-ODBC bridge driver
Native-API driver (partially java driver)
Network Protocol driver (fully java driver)
Thin driver (fully java driver)

goto the set CLASSPATH= C:\oraclexe\app\oracle\product\11.2.0\
server\jdbc\lib\ojdbc6.jar  first time set the path temorary; 

*/
import java.sql.DriverManager;
import java.sql.SQLException;
public class RegisterDemo {
	public static void main(String arg[])throws SQLException {
		DriverManager.registerDriver
		(new oracle.jdbc.driver.OracleDriver());
		System.out.println("driver is register......");
	}
}