package FirstDay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
	
	public static Connection getMYSQLconnection() {
		Connection con=null;
		try {
			System.out.println("1");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("12");
		con= DriverManager.getConnection("jdbc:mySQL://localhost:3306/mysql","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
		
	}
	public static void cleanup(Connection con, Statement st, ResultSet rs) {
		try {
			if(rs!=null)
				rs.close();
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void cleanup(Connection con,Statement  st) {
		try {
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
