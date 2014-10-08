package com.assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenTestingCreateVendeorFromExcel {
static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException 
	{
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:graylocus");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from [Sheet5$]");
            while (rs.next()) 
            {
            	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
        		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		        driver.findElement(By.linkText("More")).click();
		        driver.findElement(By.linkText("Vendors")).click();
		        driver.findElement(By.xpath("//img[@title='Create Vendor...']")).click();
		        for(int i=0; i<=0; i++ )
		        {
		        String VendorName = rs.getString("VendorName");
		        driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(VendorName);
		        String  Description = rs.getString(2);
		        driver.findElement(By.xpath("(//textarea[@class='detailedViewTextBox'])[2]")).sendKeys(Description);
		        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();        
		        
		        WebElement ele = driver.findElement(By.xpath("//span[@class='lvtHeaderText']"));
		        System.out.println(ele.getText());
		        String s = ele.getText();
		        String[] list = s.split("  ");
		        for(String obj:list)
		        {
		        	if(obj.equals(VendorName));
		        	{
		        		System.out.println(VendorName);
		        		System.out.println("should be match");
		        	}
		        	
		        }
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
