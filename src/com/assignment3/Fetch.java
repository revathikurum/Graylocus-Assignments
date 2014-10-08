package com.assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Fetch 
{
	public static Connection getConnection() throws Exception {
	    String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	    String url = "jdbc:odbc:graylocus";
	    Class.forName(driver);
	    return DriverManager.getConnection(url);
	  }

	  public static void main(String args[]) throws Exception {
	    Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;

	    conn = getConnection();
	    stmt = conn.createStatement();
	    String excelQuery = "select * from [Sheet2$] where Occupation = 'Intern'";
	    rs = stmt.executeQuery(excelQuery);
	    ResultSetMetaData rsmd = rs.getMetaData();
	    int numberOfColumns = rsmd.getColumnCount();
	    while (rs.next()) 
	    {
	    	for(int i=1;i<=numberOfColumns;i++)
	    		if(i>1)
	    		{
	    			System.out.print(" ");
	    			String columnValue = rs.getString(i);
	    			System.out.print(columnValue);
	    		}
	    	System.out.println(" ");
	    }
	    
	    rs.close();
	    stmt.close();
	    conn.close();
	  }
	}

