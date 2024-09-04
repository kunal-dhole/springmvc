package com.tka;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("uname");
		String password=request.getParameter("password");
	
		
		try {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonalimam","root","root");
	        Statement stmt=con.createStatement();
	        String s="Select username ,pass from user where ume='"+name+"'";

			ResultSet rs=stmt.executeQuery(s);
			if(rs.next()){
		    ArrayList<String> li = new ArrayList();
		    li.add("Rohit");
		    li.add("John");
		    li.add("Virat");
		    li.add("Rahul");
		    
		    request.setAttribute("data", li);
		    RequestDispatcher rd=request.getRequestDispatcher("Thank.jsp");
		    rd.forward(request, response);	
			}else {
	    request.setAttribute("msg","<h2 style='color:red'>Invalid Details</h2> ");
		RequestDispatcher rd=request.getRequestDispatcher("user.jsp");
		rd.forward(request, response);	
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
