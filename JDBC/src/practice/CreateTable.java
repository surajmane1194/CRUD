package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.xml.internal.ws.server.DraconianValidationErrorHandler;

public class CreateTable {
	private static final String insertdata ="create table Users2(\r\n" + "  id  int(3) primary key,\r\n" +
	        "  name varchar(20),\r\n" + "  email varchar(20),\r\n" + "  country varchar(20),\r\n" +
	        "  password varchar(20)\r\n" + "  );";
	
	public static void main(String[] args) throws SQLException {
		CreateTable createTable=new CreateTable();
		createTable.createTableMethod();
	}
	public void createTableMethod() throws SQLException {
		System.out.println(insertdata);
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/guide","root","root");
		Statement statement= connection.createStatement();
		boolean result= statement.execute(insertdata);
		System.out.println(result);
	}
	
	
}
