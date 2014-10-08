package com.assignment31p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Set2 {

	/**
	 * @param args
	 */
	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException 
	{
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:graylocus");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from [Sheet3$]");

            while (rs.next()) {
        
            System.out.println("--");
            String UserName=rs.getString("UserName");
            WebElement Uname=driver.findElement(By.xpath("//input[@type='text']"));Uname.sendKeys(UserName);
            if(Uname.isEnabled())
            {
            	System.out.println("PASS:: \t User Name::" +UserName);
            }
            else
            {
            	System.out.println("FAIL:: Record not Found...");
            }
            
            String Password=rs.getString("Password");
            WebElement password1=driver.findElement(By.xpath("//input[@type='password']"));password1.sendKeys(Password);
            if(password1.isEnabled())
            {
            	System.out.println("PASS::\t Password::" +Password);
            }
            else
            {
            	System.out.println("FAIL:: Record not Found...");
            }
    		
    		
            WebElement submitbutton=driver.findElement(By.xpath("//input[@id='submitButton']"));submitbutton.click();
            System.out.println("PASS::\t The Submit button is clicked");
            
    		
    		driver.findElement(By.linkText("Leads")).click();
    		
    		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
    		 
    		for(int i= 0; i<=0; i++)
    		{
    		String mr=rs.getString("ms");
    		WebElement e = driver.findElement(By.xpath("(//select[@class='small'])[2]"));
    		Select se = new Select(e);
    		se.selectByIndex(2);
    		String Fname=rs.getString("Fname");
    		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(Fname);
    		
    		String mobile=rs.getString("mobile");
    		driver.findElement(By.xpath("(//input[@id='mobile'])")).sendKeys(mobile);
    		
    		String company=rs.getString("company");
    		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[5]")).sendKeys(company);
    		
    		String Lname=rs.getString("Lname");
    		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[3]")).sendKeys(Lname);
    		
    		String designation=rs.getString("designation");
    		driver.findElement(By.xpath("//input[@id='designation']")).sendKeys(designation);
    		
    		String Email=rs.getString("Email");
    		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
    		
    		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
    		}
        		
        		driver.navigate().back();
        		
        		driver.navigate().back();
        		
        		String Searchfor=rs.getString("Searchfor");
                WebElement sear=driver.findElement(By.xpath("//input[@class='txtBox']"));sear.sendKeys(Searchfor);
                if(sear.isEnabled())
                {
                	System.out.println("PASS:: \t Searchfor::" +Searchfor);
                }
                else
                {
                	System.out.println("FAIL:: Records are not Found...");
                }
              
                String In=rs.getString("In");
                WebElement in1=driver.findElement(By.xpath("//select[@id='bas_searchfield']"));
                Select se3 = new Select(in1);
        		se3.selectByIndex(6);
        		
                if(in1.isEnabled())
                {
                	System.out.println("PASS:: \t In::" +In);
                }
                else
                {
                	System.out.println("FAIL:: Records are not Found...");
                }
        	
                String SearchNow=rs.getString("SearchNow");
                WebElement s=driver.findElement(By.xpath("//input[@class='crmbutton small create']"));
                s.click();
                if(s.isEnabled())
                {
                	System.out.println("PASS:: \t  SearchNow::" + SearchNow);
                }

                	else
                {
                	System.out.println("FAIL:: Records are not Found...");
                }
            }
                
                st.close();
                con.close();
                } catch (Exception ex) {
                System.err.print("Exception: ");
                System.err.println(ex.getMessage());
                } 
       
            Thread.sleep(25000);
            driver.close();
            }
		
	
	}


