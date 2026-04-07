package com.sathya.product;

import java.sql.Connection;
import java.sql.DriverManager;

public class productConnection {
	public static void main(String[]args) {
		Connection connection = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mouni","mouni");
			System.out.println("connection craeted");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try
		{
			connection.close();
			System.out.println("connection closed..args...");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
	}


