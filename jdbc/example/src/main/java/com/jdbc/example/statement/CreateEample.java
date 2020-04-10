package com.jdbc.example.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEample {
	
	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");) {

			Statement stmt = con.createStatement();

			String sql = "INSERT INTO `productlines` (`productLine`, `textDescription`, `htmlDescription`, `image`) VALUES ('Cycle', 'Bicycle', NULL, NULL)";
			
			int rowsInserted =  stmt.executeUpdate(sql);
			
			System.out.println("No. of rows inserted : "+rowsInserted);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
}
