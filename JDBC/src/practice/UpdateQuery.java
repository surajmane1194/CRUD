package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
	   private static final String UPDATE_USERS_SQL = "update users set name = \"Sam\" where id = 2;";
	public static void main(String[] args) throws SQLException {
		UpdateQuery updateQuery= new UpdateQuery();
		updateQuery.updateQueryMethod();
	}
	public void updateQueryMethod() throws SQLException {
		try{Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/guide","root","root");
		Statement statement=connection.createStatement();
		int result=statement.executeUpdate(UPDATE_USERS_SQL);
		System.out.println("Rows Affected is  "+result);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	   

}
