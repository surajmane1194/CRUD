package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import com.mysql.jdbc.Driver;

import sun.print.PeekGraphics;

public class BatchInsert {
	
/*
    String INSERT_USERS_SQL = "INSERT INTO users" + "  (id, name, email, country, password) VALUES " +
        " (?, ?, ?, ?, ?);";

*/
	static String Insert_User_Sql="Insert into users"+"(id,name,email,country,password) values"+
			"(?, ?, ?, ?, ?);";
	public static void main(String[] args) throws SQLException {
	BatchInsertMethod();
	}
	private static void BatchInsertMethod() throws SQLException {
		try{
			Connection connection= DriverManager.getConnection("JDBC:mysql://localhost:3306/guide","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement(Insert_User_Sql);
		connection.setAutoCommit(false);
		
		preparedStatement.setInt(1, 10);
		preparedStatement.setString(2, "Sam");
		preparedStatement.setString(3, "sam@gmail.com");
		preparedStatement.setString(4, "India");
		preparedStatement.setString(5, "ssss");
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 11);
		preparedStatement.setString(2, "ram");
		preparedStatement.setString(3, "ram@gmail.com");
		preparedStatement.setString(4, "Pak");
		preparedStatement.setString(5, "dddd");
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 12);
		preparedStatement.setString(2, "kam");
		preparedStatement.setString(3, "kam@gmail.com");
		preparedStatement.setString(4, "xak");
		preparedStatement.setString(5, "aaaa");
		preparedStatement.addBatch();
		
		int[] update= preparedStatement.executeBatch();
		System.out.println(Arrays.toString(update));
		connection.commit();
		connection.setAutoCommit(true);
		}
		catch (Exception e) {
			e.printStackTrace();
	}
	
	
	
		}
}
