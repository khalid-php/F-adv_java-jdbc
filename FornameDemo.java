/* Different ways of Registering a Driver
When we are developing jdbc program, we need to register the Driver
The registeration of the driver can be done in 4 ways.
1.DriverManager.registerDriver();
2.Class.forName();
3.predefined system property jdbc.driver
4.Automatic Registration.
2.Class.forName()
When we specify a class name as a parameter to Class.forName()
then that class which is specified will be loaded and the static
block of the class will be executed.
According to SUN Microsystems JDBC spectifications,any database
vendor who is providing the implementation class which should contain
the logic for registering their own driver.
*/
public class OracleDriver implements Driver {
	static{
		Driver d=new OracleDriver();
		DriverManager.registerDriver();
	}
}
public class InetDriver implements Driver {
	static {
		Driver d=new InetDriver();
		DriverManager.registerDriver(d);
	}
}