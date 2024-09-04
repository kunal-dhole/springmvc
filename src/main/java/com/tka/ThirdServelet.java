package com.tka;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServelet
 */
@WebServlet("/third")
public class ThirdServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ThirdServelet() {
        super();
        System.out.println("I am in Contructor");
    }
    
    public void init()
    {
    	System.out.println("I am in init");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Goget method called");
	}
	
	public void destroy() {
		System.out.println("destroy method called");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s= request.getParameter("uname");
		String password=request.getParameter("password");
		
		if(s.equals("admin")) {
			
			ArrayList<String> li = new ArrayList();
			li.add("Kunal");
			li.add("Rohit");
			li.add("Sopan");
			li.add("Virat");
			
//			request.setAttribute("msg","<h2 style='color:green'>Thanks For Resistration</h2> ");
			request.setAttribute("data", li);
			RequestDispatcher rd=request.getRequestDispatcher("Thank.jsp");
			rd.forward(request, response);
		}else {
			
			request.setAttribute("msg","<h2 style='color:red'>Invalid Details</h2> ");
			RequestDispatcher rd=request.getRequestDispatcher("login2.jsp");
			rd.forward(request, response);
			
		}
		
	}

}
