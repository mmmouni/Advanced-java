package com.sathya.Servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FistApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		writer.println("This is first Servlet...");
		writer.println("Adv java class by Mr.ratan sir...");
		writer.println("Servlet application very good...");
		writer.println("Ganesh having Dummy laptop...");
	}
}
