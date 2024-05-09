package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/dhanraj";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE User SET user_password=?, user_email=? WHERE user_name=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
//		    statement.setString(1, "123");
		    statement.setString(1, "manoj123");
		    statement.setString(2, "Boga@gmail.com");
		    statement.setString(3, "Manoj");
		    
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
