package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaGuide {
	
	private final static String query = "select e_id,e_name,e_salary,e_age,e_gender,e_dept from employee3";

	public static void main(String[] args) {
try {
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	Statement statement= connection.createStatement();
	ResultSet rs=	statement.executeQuery(query);
	while(rs.next()) {
		int id= rs.getInt("e_id");
		String name= rs.getString("e_name");
		int salary= rs.getInt("e_salary");
		int age= rs.getInt("e_age");
		String gender= rs.getString("e_gender");
		String dept= rs.getString("e_dept");
		System.out.println(id+","+name+","+salary+","+age+","+gender+","+dept+".");
	}




} catch (Exception e) {
	e.printStackTrace();
}}

}
