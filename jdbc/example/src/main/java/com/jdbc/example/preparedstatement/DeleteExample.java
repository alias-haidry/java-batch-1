package com.jdbc.example.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteExample {
	
	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");) {

			Statement stmt = con.createStatement();

			String sql = "DELETE FROM `payments` WHERE `payments`.`customerNumber` < 200;";
			
			int rowsDeleted=  stmt.executeUpdate(sql);
			
			System.out.println("No. of rows deleted : "+rowsDeleted);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
}
