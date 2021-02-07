package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StmtEx  {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println(3);
		Statement statement=connection.createStatement();
		System.out.println(4);
		String sql="select * from employee3";
		ResultSet resultSet = statement.executeQuery(sql);
		System.out.println(resultSet);
	}
}
