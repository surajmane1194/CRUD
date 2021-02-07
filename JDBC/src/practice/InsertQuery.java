package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	private static final String INSERT_MULTIPLE_USERS_SQL = "INSERT INTO Users " +
	        "VALUES (4, 'Pramod', 'pramod@gmail.com', 'India', '123')," +
	        "(5, 'Deepa', 'deepa@gmail.com', 'India', '123')," + "(6, 'Tom', 'top@gmail.com', 'India', '123');";

	public static void main(String[] args) throws SQLException {
	InsertQuery insertQuery=new InsertQuery();
	insertQuery.insertQueryMethod();
	}
	
	public void insertQueryMethod() throws SQLException {
		try{Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/guide","root","root");
		Statement statement= connection.createStatement();
		int result= statement.executeUpdate(INSERT_MULTIPLE_USERS_SQL);
		System.out.println("No of rows affected "+result);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
