package com.sathya.product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class proj_2_tap_ACC {
	private static FileInputStream fileinputstream;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet result;	
	
	static void close() throws SQLException, IOException{ 
		if (result != null) {
			result.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}
		if (fileinputstream  != null) {
			fileinputstream.close();
		}
		
	}
	private static final String QUERY1 = "INSERT INTO emp (id,name,salary) values (4,'Praveen',200000)";
	private static final String QUERY2 = "INSERT INTO emp (id,name,salary) values (5,'reddy',200000)";
	private static final String QUERY3 = "INSERT INTO emp (id,name,salary) values (6,'kumar',200000)";
	private static final String QUERY4 = "INSERT INTO emp (id,name,salary) values (7,'',200000)";	
	private static final String QUERY5 = "DELETE FROM emp where name like 'Praveen'";
	

	public static void main(String[] args) {
		try {
//			FileInputStream fileinputstream = new FileInputStream("C:\\Advjava\\JDBCproject\\src\\main\\java\\com\\sathya\\product\\example");
//			Properties properties = new Properties();
//			
//			properties.load(fileinputstream);
//			String url =  properties.getPorperties("url");
//			String pass =  properties.getPorperties("pass");
//			String name =  properties.getPorperties("name");
			
			String url ="jdbc:mysql://localhost:1521/xe";
			//api:vendor://ip-adderss:portnum/dbname
			String pass = "mouni";
			String name ="mouni";
			// Connection to DataBase
			connection = DriverManager.getConnection(url, name, pass);
			System.out.println("connection is done");
			//Statement
			statement = connection.createStatement();
			String query = "SELECT * FROM EMP";
			//result Set
			result = statement.executeQuery(query);
			
			//Printing the details
			PrintDataBase.displaydetails(result);
			 
			 // After update the Data base values and Printing the result
			 
			// String query1 =  "update emp set salary = salary + 20000";
			 
			 statement.addBatch(QUERY1);
			 statement.addBatch(QUERY2);
			 statement.addBatch(QUERY3);
			 statement.addBatch(QUERY4);
			 statement.addBatch(QUERY5);
			 int[] batch = statement.executeBatch();
			 for(int i:batch) {
				 System.out.println(i+" ");
			 }
			 
			 
			 //statement.executeUpdate(QUERY);
			 statement = connection.createStatement();			
			result = statement.executeQuery("SELECT * FROM EMP");
				
			 PrintDataBase.displaydetails(result);	
		
		
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		finally {
			try {
				close() ;
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}