package com.royal.contoller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String uname=req.getParameter("username");
			String pass=req.getParameter("password");
			
			
			PrintWriter out=resp.getWriter();
			out.println("You Login Succesfull");
			out.println("UserName is "+uname);
			out.println("Password is "+pass);
			
		}
	
	
//	
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String uname=request.getParameter("username");
//		String pass=request.getParameter("password");
//		
//		PrintWriter out=response.getWriter();
//		out.println("<h1>UserName is </h1>"+uname);
//		out.println("<h1>Password is </h1>"+pass);
//
//	}

}
