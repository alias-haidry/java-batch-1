package com.jdbc.example.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateExample {
	
	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");) {

			Statement stmt = con.createStatement();

			String sql = "UPDATE `payments` SET `amount`= `amount` + 10000000";
			
			int rowsUpdated =  stmt.executeUpdate(sql);
			
			System.out.println("No. of rows updated : "+rowsUpdated);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
}
