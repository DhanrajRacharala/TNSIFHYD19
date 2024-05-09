package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/dhanraj";
		String username = "root";
		String password = "root";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM user";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
				int user_id = result.getInt(1);
				String user_name = result.getString(2);
				String user_password = result.getString(3);
				String user_email = result.getString(4);
				
				String output = "User #%d: %d - %s - %s - %s";
				System.out.println(String.format(output, ++count, user_id, user_name, user_password, user_email));
				
				
//			    String name = result.getString(2);
//			    String pass = result.getString(3);
//			    String fullname = result.getString("fullname");
//			    String email = result.getString("email");
//			 
//			    String output = "User #%d: %s - %s - %s - %s";
//			    System.out.println(String.format(output, ++count, name, pass, fullname, email));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
