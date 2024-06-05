package com.royal.config;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class FirstServletCongig
 */
public class FirstServletCongig extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter out=resp.getWriter();
		ServletConfig	config=getServletConfig();
		
		Enumeration<String>paramNames=config.getInitParameterNames();
		
		
			
//			String l1=config.getInitParameter("Lang1");
//			String l2=config.getInitParameter("Lang2");
//			String l3=config.getInitParameter("Lang3");
			int i=1;
			while(paramNames.hasMoreElements()) {
				String paramName=paramNames.nextElement();
				String paramValue=config.getInitParameter(paramName);
				out.println("Lang "+(i++)+" :"+paramValue);
				
			}
			
//			out.println("Lang 1"+l1);
//			out.println("Lang 2"+l2);
//			out.println("Lang 3"+l3);
			
		}

}
