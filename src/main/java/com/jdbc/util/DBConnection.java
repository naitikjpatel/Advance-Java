package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static String URLNAME="jdbc:mysql://localhost:3306/test1";
	private static String DRIVERCLASS="com.mysql.cj.jdbc.Driver";
	private static String USERNAME="root";
	private static String PASSWORD="admin";
	
	
	public static Connection getConnection() {
		Connection con=null;
		
		try {
			Class.forName(DRIVERCLASS);
			try {
				con=DriverManager.getConnection(URLNAME);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(con!=null)
			{
				System.out.println("Connection Sucessfully Done");
			}
			else {
				System.out.println("Something went wrong");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return con;
	}
}
