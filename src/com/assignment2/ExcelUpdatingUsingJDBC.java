package com.assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcelUpdatingUsingJDBC 
{
	public static void main(String[] args) throws SQLException {
		Connection conn1 = null;
		Statement stmnt = null;
		
		try{
		Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
		conn1 = DriverManager.getConnection( "jdbc:odbc:graylocus;readOnly=false");
		 stmnt = conn1.createStatement();
		String query1 = "INSERT into [Sheet1$] (SearchData,Links) VALUES('Facebook','80');";
		stmnt.executeUpdate(query1);


		}catch(Exception e){
			System.err.println(e);
		}finally{
			stmnt.close();
			conn1.close();
		}
	}
}
