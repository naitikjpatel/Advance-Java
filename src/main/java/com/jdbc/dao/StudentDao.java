package com.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.bean.StudentBean;
import com.jdbc.util.DBConnection;

public class StudentDao {

	public int insertData(StudentBean sbean) {
		
		int rowsAffected=0;
		Statement st=null;
		
		Connection con=DBConnection.getConnection();
		String insertQuery="insert into student ("+sbean.getRno()+","+sbean.getName()+","+sbean.getStd()+","+sbean.getMarks()+")";
		if(con!=null) {
		try {
			st=con.createStatement();
			st.executeUpdate(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else {
			System.out.println("Connection is not establish");
		}
		
		
		
		return rowsAffected;
	}
	
	public static void main(String[] args) {
		
		
		StudentDao sdao=new StudentDao();
		
//		This code for the inser data into the database
		int rno,std,marks;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Roll No");
		rno=sc.nextInt();
		System.out.println("Enter the Std");
		std=sc.nextInt();
		System.out.println("Enter the marks");
		marks=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student name");
		name=sc.nextLine();
		
		StudentBean sbean=new StudentBean(rno,marks,std,name);
		int rowsAffected=sdao.insertData(sbean);
		
	}
	
}
