package com.elibrary.dao;

import java.sql.*;

public class DB {
	public static Connection getCon() throws SQLException, ClassNotFoundException {

		

//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conection=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_library" , "root ","admin");
//		
//	return conection;
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/e_library";

		final String USER = "root";
		final String PASS = "admin";

		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		return conn;
	}
}
