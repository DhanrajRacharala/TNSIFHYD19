package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/dhanraj";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM User WHERE user_name=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "Naveen");
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("The user is deleted successfully!");
		    } else {
		    	System.out.println("There is no name with that name");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
