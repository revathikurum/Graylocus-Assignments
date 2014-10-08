package com.assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcelReadingUsingJDBC 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection conn1 = null;
		Statement stmnt = null;
		try{
		Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
		conn1 = DriverManager.getConnection("jdbc:odbc:graylocus");
		 stmnt = conn1.createStatement();
		String query1 = "select * from [Sheet1$]";
		ResultSet rs = stmnt.executeQuery(query1);
		while(rs.next()){
			String search=rs.getString("SearchData");

			System.out.println(search);
		}

		}catch(Exception e){
			System.err.println(e);
		}finally{
			stmnt.close();
			conn1.close();
		}
	}
}
