package com.jdbc.example.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteExample {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");) {

			String sql = "DELETE FROM `payments` WHERE `payments`.`customerNumber` < ? ;";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, 200);

			int rowsDeleted = stmt.executeUpdate();

			System.out.println("No. of rows deleted : " + rowsDeleted);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
