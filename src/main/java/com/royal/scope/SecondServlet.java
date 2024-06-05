package com.royal.scope;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.royal.bean.EmployeeBean;
import com.royal.bean.StudentBean;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	StudentBean sbean=(StudentBean)request.getAttribute("sbean");
	
	System.out.println("Print Object Details");
	System.out.println("Roll No:"+sbean.getRno()+" Name :"+sbean.getName()+" Std:"+sbean.getRno());
	
	
//	request.removeAttribute("sbean");
	
//	create a employee object
	EmployeeBean ebean=new EmployeeBean(100,"Naitik Patel",1200000);
//	add employee object in the request
	request.setAttribute("ebean", ebean);
	RequestDispatcher rd=request.getRequestDispatcher("ThirdServlet");
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
