package com.assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecutionExcelFromLogin 
{
	public enum keyWord 
	{
		 ENTER, CLICK, LAUNCH;
	}
	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException 
	{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:graylocus");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from [Sheet4$]");
            String Operation, Object, TestData;
            while (rs.next()) 
            {
            	Operation = rs.getString("Operation");
            	Object = rs.getString("Object");
            	TestData = rs.getString("TestData");
            	
				switch(keyWord.valueOf(Operation.toUpperCase()))
				{
					case LAUNCH:
		            		driver.get(TestData);
		            		driver.manage().window().maximize();
		            	    break;
            	    case ENTER: 
	            	    	WebElement ele=driver.findElement(By.xpath(Object));
	            	    	ele.sendKeys("admin");
	            	    	break;
            	    case CLICK:
		        	    	WebElement ele1=driver.findElement(By.xpath(Object));
		        	    	ele1.click();
		        	    	break;        	
		        	
			   }
            }
            		st.close();
                    con.close();
	}      
           
}
	


