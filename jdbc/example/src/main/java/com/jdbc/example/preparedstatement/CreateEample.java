package com.jdbc.example.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateEample {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");) {

			String sql = "INSERT INTO `productlines` (`productLine`, `textDescription`, `htmlDescription`, `image`) VALUES (?,?,?,?) ";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "Cycle");
			stmt.setString(2, "Bicycle");
			stmt.setString(3, null);
			stmt.setString(4, null);

			int rowsInserted = stmt.executeUpdate();

			System.out.println("No. of rows inserted : " + rowsInserted);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
