package com.royal.applcationlevelScope;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.royal.bean.StudentBean;

/**
 * Servlet implementation class application_level_scope
 */
public class application_level_scope extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context=getServletContext();
		
		context.setAttribute("lang1", "Java Programming");
		StudentBean sbean=new StudentBean(10,"naitik j patel",12);
		context.setAttribute("sbean", sbean);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
