package com.servletcollabration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter out=resp.getWriter();
//			RequestDispatcher rd=req.getRequestDispatcher("SecondServlet1");
////			rd.forward(req, resp);
//			rd.include(req, resp);
//			
//			
//			out.println("<h1>You are in FirstServlet</h1>");
//			out.println("<h1>Hello</h1>");
			
			
			//this the responseWay
			
			resp.sendRedirect("https://www.google.com/");
			
		}

}
