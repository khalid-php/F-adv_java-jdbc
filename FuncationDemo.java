/* the function creating 
create or replace function function_name(only input parameter)
return type
as
declaretion
begin
sql queries
business logic
return value
end function_name
/
create or replace function addition1(fno1 in number,sno in number)
return number
as
tno number
begin
tno:=fno+sno;
return tno;
end addition1;
/
*/
//package 
import java.sql.*;
import oracle.jdbc.driver.*;
//class name
public class FuncationDemo {
	//main method
	public static void main(String ar[])throws SQLException {
		//registering the driver manager
		DriverManager.registerDriver(new OracleDriver());
		//connection the establish
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hussain");
		//using the Callable statement 
		CallableStatement cst=con.prepareCall("{?=call added(?,?)}");
		//execute the output 
		cst.registerOutParameter(1,Types.NUMERIC);
		cst.setInt(2,-12);
		cst.setInt(3,-06);
		cst.execute();
		int sum=cst.getInt(1);
		System.out.println("result:"+sum);
		con.close();
	}

}

/* whenever we execute a jdbc program having CallableStatement
the procedure or function that is executed may have output parameter
or returntype. if a procedure is having output parameter and if the
and if a function is having returntype then they must be 
registered by using regisertOutparameter().
registerOutparameter(int positionparameterIndex,int sqlType);
Types is predefined class available in java.sql package,which 
define the constant that are used to identify generic SQL types
called jdbc types.All the constants in types class are 
declered as static and therefore they can be accessed directly
by using class name.
procedure
1.procedure is used to execute the business logic.
2.procedure must not have return type
3.procedure can have both input and output parameters
procedure can call function
procedure can use try catch block to perform execution
procedure cannot be called from select statement
function is used to perform some calulation
function must have return types
function will return only one values
function can have only input parameters
function cannot call procedure
function cannot use try catch block to perform exeception handling
function can be called from select statement

