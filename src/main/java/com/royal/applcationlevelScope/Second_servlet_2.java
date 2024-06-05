package com.royal.applcationlevelScope;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;


public class Second_servlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		ServletContext context=getServletContext();
		StudentBean sbean=(StudentBean)context.getAttribute("sbean");
		String lang=(String)context.getAttribute("lang1");
		
		out.println("Student Details is \n"+"name	:"+sbean.getName()+"\nroll	:"+sbean.getRno()+"\nstd	 :"+sbean.getStd());
		out.println("Language is :"+lang);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
