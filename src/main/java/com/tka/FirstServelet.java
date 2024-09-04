package com.tka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/first")
public class FirstServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s=request.getParameter("num");
		String s2=request.getParameter("num2");
	     int num=Integer.parseInt(s);
	     int num2=Integer.parseInt(s2);
		 int answer=num+num2;
		 
		RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
		request.setAttribute("answer", answer);
			
		
		rd.forward(request, response);
		
		
		
	}


}
