package com.assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbInteractionDelete {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException 
	{
		Connection connection = null;
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		String dbServer="localhost";
		String portNum="33307";
		String dbName="vtigercrm540";
		String userId="root";
		String password="root";
		String connectUrl = dbServer + ":" + portNum;
		connection = DriverManager.getConnection("jdbc:mysql://"	+ connectUrl + "/" + dbName + "", userId, password); 
		String query1 = "DELETE FROM vtiger_leaddetails WHERE email=? ";
		PreparedStatement ps =connection.prepareStatement(query1);
		ps.setString(1, "abc@gmail.com");
		ps.executeUpdate();
		ps.close();
	}
		catch(Exception e){
		System.err.println(e);
	}finally{
		connection.close();
	}
}

	}


