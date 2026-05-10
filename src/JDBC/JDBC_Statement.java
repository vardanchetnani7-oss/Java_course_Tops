package JDBC;
import java.sql.*;
public class JDBC_Statement {
		
public static void main(String[] args) throws Exception {
			
			
			String url = "jdbc:postgresql://localhost:5432/demo";
			String uname = "postgres";
			String pass = "new_password";
			String sql = "delete from student where sid = 4";
			//String sql = "update student set sname='max'where sid = 4";
			//String sql ="insert into student values(4,'john',40)";
			//String sql = "select * from student";
			//load and register
				Class.forName("org.postgresql.Driver");
				Connection con  = DriverManager.getConnection(url,uname,pass);
				System.out.println("connection successful");
//				create statement
				Statement st  = con.createStatement();
				//execute statement
        		boolean status =	st.execute(sql);	
			    System.out.println(status);
//				process the results
//			     ResultSet rs = st.executeQuery(sql);
//				while(rs.next()) {
//					System.out.print(rs.getInt(1)+"-");
//					System.out.print(rs.getString(2)+"-");
//					System.out.println(rs.getInt(3));
//				}
//				close
				con.close();
		}

		
		
	}

