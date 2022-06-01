package com.qa.jdbc;

import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class JDBC {

	public static void main(String [] args) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/Sakila";
		String username = "root";
		String password = "pass";
		String query = "select * from actor";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, username, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while (result.next()) {
				String actorID = "";
				String actorFirstName ="";
				
				for (int i = 1;i<=1;i++) {
					actorID += "ID:" + result.getString(i) + ": ";
					
				}
				for (int i=2;i<=2;i++){
					actorFirstName = "First Name :" + result.getString(i);
				}
				
				System.out.println(actorID + actorFirstName);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			
		} finally {
			
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
			
		}
		
	}
	
}
