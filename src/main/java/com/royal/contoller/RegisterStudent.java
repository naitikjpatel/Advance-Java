package com.royal.contoller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet implementation class RegisterStudent
 */
public class RegisterStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String mname=req.getParameter("mname");
		String lname=req.getParameter("lname");
		String gender=req.getParameter("gender");
		String city=req.getParameter("city");
		String hobbies[]=req.getParameterValues("hobbie");
		String address=req.getParameter("address");
		
		System.out.println("FirstName  : "+fname);
		System.out.println("MiddleName : "+mname);
		System.out.println("LastName   : "+lname);
		System.out.println("Gender     : "+gender);
		System.out.println("City       : "+city);
		StringBuilder sb=new StringBuilder();
//		logic ->For Formating
		int i=0;
		for(;i<hobbies.length-1;i++) {
			sb.append(hobbies[i]+",");
		}
		sb.append(hobbies[i]+".");
		
		System.out.println("Hobbies    : "+sb);
		System.out.println("Address    : "+address);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		Enumeration<String> paramNames=request.getParameterNames();
		while(paramNames.hasMoreElements()) {
			String paramName=paramNames.nextElement();
			String paramValue=null;
			String hobbiesValue[];
			
			if(paramName.equalsIgnoreCase("hobbie")) {
				hobbiesValue=request.getParameterValues(paramName);
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<hobbiesValue.length;i++) {
					sb.append(hobbiesValue[i]+" ");
				}
				System.out.println(paramName+" :: "+sb);
			}
			else {
				paramValue=request.getParameter(paramName);
				System.out.println(paramName+" :: "+paramValue);
			}
		}
	}

}
