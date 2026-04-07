package com.sathya.servlettojdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet")

public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get the data
				String userId = request.getParameter("userId");
				String userName = request.getParameter("userName");
			    String userEmail = request.getParameter("userEmail");
			    String userMobile = request.getParameter("userMobile");
			    String userLocation = request.getParameter("userLocation");
			    
			    //calling  the Dao method by passing Servlet data.
			    
			    UserDao userDao = new UserDao();
			    UserDao.servlet(userId,userName,userEmail,userMobile,userLocation);
			    //Response
			    
			    PrintWriter writer = response.getWriter();
			    writer.println("Data inserted Successfully....");
	}

}
