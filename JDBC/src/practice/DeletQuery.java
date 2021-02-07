package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletQuery {
	private static final String DELETE_USERS_SQL="delete from users where id=1;";

	public static void main(String[] args) {
		DeletQuery deletQuery= new DeletQuery();
		deletQuery.DeletQueryMethod();
	}
	
	public void DeletQueryMethod() {
		try {
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/guide","root","root");
			Statement statement=connection.createStatement();
			int result= statement.executeUpdate(DELETE_USERS_SQL);
			System.out.println("Rows Affected By is "+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
