package com.sathya.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get the data
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		
		//process the data
		
		if(Username.equalsIgnoreCase("Mouni")&&Password.equalsIgnoreCase("Mouni@123"));
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("sucess.html");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			RequestDispatcher dispatcher = request.getRequestDispatcher("loginpage.html");
			RequestDispatcher dispacher;
			dispacher.include(request, response);
			writer.println("Login fail.... try with valid data");
		}
	}
}
