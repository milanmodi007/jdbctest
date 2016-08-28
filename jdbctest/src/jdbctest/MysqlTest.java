package jdbctest;
import java.sql.*;

public class MysqlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
			String DB_URL = "jdbc:mysql://localhost:3306/test";

		   //  Database credentials
			String USER = "root";
			String PASS = "milan";
			Connection conn = null;
			Statement stmt = null;
		   
			try 
			{
				//testing commit.
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				stmt = conn.createStatement();
				String sql;
				sql = "select * from employees";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					int id = rs.getInt("id");
					int age = rs.getInt("age");
					String name = rs.getString("name");
					System.out.println("ID="+id+" name="+name+"  age="+age);
				}
				rs.close();
				stmt.close();
				conn.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
