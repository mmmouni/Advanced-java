package com.sathya.Fullname;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Fullname extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the client requested data
				String firstname=request.getParameter("firstname");
				String Lastname=request.getParameter("Lastname");
				
				//process the data
				String fullname;
				fullname=firstname  +" "+ Lastname;
				
				//Render the response 
				response.setContentType("text/plian");
				PrintWriter writer = response.getWriter();
				writer.println("your full name..."+fullname);

	}

}
