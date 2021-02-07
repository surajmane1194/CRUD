package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrepareStmtQuery {
	  private static final String INSERT_USERS_SQL = "INSERT INTO users" +
		        "  (id, name, email, country, password) VALUES " +
		        " (?, ?, ?, ?, ?);";
	  public static void main(String[] args) {
		PrepareStmtQuery prepareStmtQuery= new PrepareStmtQuery();
		prepareStmtQuery.prepareStamentMethod();
	}
	
	  public void prepareStamentMethod() {
		  try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/guide","root","root");
			PreparedStatement pStatement= connection.prepareStatement(INSERT_USERS_SQL);
			pStatement.setInt(1, 2);
			pStatement.setString(2, "sony");
			pStatement.setString(3, "sony@gmail.com");
			pStatement.setString(4, "UK");
			pStatement.setString(5, "secret");
			System.out.println(pStatement);
			int result=pStatement.executeUpdate();
			System.out.println(result);
			/*ResultSet resultSet= pStatement.executeQuery(INSERT_USERS_SQL);
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name= resultSet.getString("name");
				String email= resultSet.getString("email");
				String country= resultSet.getString("country");
				String password= resultSet.getString("password");
			System.out.println("Id "+id+" "+name+" "+email+" "+country+" "+password );
			}
*/			
		  } catch (Exception e) {
		e.printStackTrace();
		  }
	  }
	
	
}
