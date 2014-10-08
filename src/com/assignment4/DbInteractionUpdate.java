package com.assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbInteractionUpdate {


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
		String query1 = "UPDATE vtiger_leaddetails SET email ='revs@gmail.com' WHERE lead_no= 'LEA41' ";
		PreparedStatement pstmt =connection.prepareStatement(query1);
		pstmt.executeUpdate();
		pstmt.close();
	}
		catch(Exception e){
		System.err.println(e);
	}finally{
		connection.close();
	}
}

	}


