package com.jdbc.example.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateExample {
	
	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");) {

			String sql = "UPDATE `payments` SET `amount`= `amount` + ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, 10000000);
			
			int rowsUpdated =  stmt.executeUpdate();
			
			System.out.println("No. of rows updated : "+rowsUpdated);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
}
