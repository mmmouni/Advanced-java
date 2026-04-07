package com.sathya.product;

public class mysql {
	

	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class PrintDataBase {	
			public static void displaydetails(ResultSet result) throws SQLException {
				while(result.next() == true) {
					 System.out.println(result.getInt(1)
							 +" "+  result.getString(2)
							 +" "+  result.getString(3)
							 +" "+ result.getInt(4) );
				 }
			}

		}

}
