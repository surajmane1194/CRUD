package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareDelet {
	private static final String Delet_Query="delete from employee3 where e_id = ?;";

	public static void main(String[] args) {
		PrepareDelet prepareDelet= new PrepareDelet();
		prepareDelet.prepareDeletMethod();
	}
	public void prepareDeletMethod() {
		try {
			Connection  connection=DriverManager.getConnection("JDBC:mysql://localhost:3306/test","root","root");
			PreparedStatement statement=connection.prepareStatement(Delet_Query);
			statement.setInt(1, 6);
		int result=statement.executeUpdate();
		System.out.println(result);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
