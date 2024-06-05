package com.royal.scope;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.royal.bean.EmployeeBean;
import com.royal.bean.StudentBean;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		StudentBean sbean=(StudentBean)request.getAttribute("sbean");
//		StudentBean sbean=(StudentBean)request.getAttribute("sbean");
		EmployeeBean ebean=(EmployeeBean) request.getAttribute("ebean");
		
		System.out.println("Student Object Details in the ThirdServlet");
		System.out.println("Roll No:"+sbean.getRno()+" Name :"+sbean.getName()+" Std:"+sbean.getRno());
	
		System.out.println("Employee Object Details in the ThirdServlet");
		System.out.println("Id :"+ebean.getId()+" Name :"+ebean.getName()+" Salary :"+ebean.getSalary());
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
