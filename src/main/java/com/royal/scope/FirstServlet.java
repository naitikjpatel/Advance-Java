package com.royal.scope;

import com.royal.bean.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.royal.bean.StudentBean;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentBean sbean=	new StudentBean(1,"naitik" ,11);
		request.setAttribute("sbean", sbean);
		 
	
		RequestDispatcher rd=request.getRequestDispatcher("SecondServlet11");
		rd.forward(request, response);
	
//		if we use sendRedirect then we not pass request and response object > here it create a new request 
//		response.sendRedirect("SecondServlet11");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
}
