package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBC_PreparedStatement {
	public static void main(String[] args) throws Exception {
		
		
		int sid = 101;
		String sname = "Max";
		int marks = 40;
		
		
		String url = "jdbc:postgresql://localhost:5432/demo";
		String uname = "postgres";
		String pass = "new_password";
		String sql = "insert into student values (?,?,?)";
		
		Class.forName("org.postgresql.Driver");
		Connection con  = DriverManager.getConnection(url,uname,pass);
		System.out.println("connection successful");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, sid);
		st.setString(2, sname);
		st.setInt(3, marks);
		
		st.execute();
		

		
}
}
