package com.royal.contoller;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class FirstServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("First Servlet --init() ---"+this);
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("First Servlet Service method "+this);
	}
	@Override
	public void destroy() {
		System.out.println("First Servlet -- destroy() --"+this);
	}
	

}
