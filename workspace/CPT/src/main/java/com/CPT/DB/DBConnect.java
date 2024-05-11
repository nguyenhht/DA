package com.CPT.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static String username = "hung";
	private static String password = "28102003";
	private static String url = "jdbc:sqlserver://localhost:1433;databaseName=DA;Encrypt=True;TrustServerCertificate=True";

	public static Connection getConnect() {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
