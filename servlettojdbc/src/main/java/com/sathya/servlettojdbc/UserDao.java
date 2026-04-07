package com.sathya.servlettojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
	public static void servlet(String userId,String userName,String userEmail,String userMobile,String userLocation)
	{
		//get the Connection
		Connection connection = DBConnectionUtils.createconnection();
		try
		{
			PreparedStatement preparedStatement = connection.prepareStatement(("insert into user_details valuse(?,?,?,?,?)"));
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userName);
			preparedStatement.setString(3, userEmail);
			preparedStatement.setString(4, userMobile);
			preparedStatement.setString(5, userLocation);
			preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
