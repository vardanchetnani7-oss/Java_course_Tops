package JDBC;
//import the package
import java.sql.*;
public class JDBC_Connectivity {
	
	public static void main(String[] args)throws Exception {
		
		
		String url = "jdbc:postgresql://localhost:5432/demo";
		String uname = "postgres";
		String pass = "new_password";
		//load and register
			Class.forName("org.postgresql.Driver");
			Connection con  = DriverManager.getConnection(url,uname,pass);
			System.out.println("connection successful");
//			create connection
//			create statement
//			execute statement
//			process the results
//			close
	}

	
	
}
