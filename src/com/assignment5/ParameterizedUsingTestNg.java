package com.assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedUsingTestNg {
 
	  static WebDriver driver=new FirefoxDriver();
	  @Test
	  public void login() 
	  {
		  driver = new FirefoxDriver();
	      driver.get("https://www.google.co.in/");
	     
	  }
	      @DataProvider(name = "test1")
	      public Object[][] createData1() 
	      {
	    	  //Apple
	    	  WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
	          ele.sendKeys("Apple");
	          ele.sendKeys(Keys.ENTER);
	          String apple=driver.findElement(By.xpath("//ol[@id='rso']/li[1]/div/div/h3/a")).getText();
	          
	          //Mango
	          WebElement ele1 = driver.findElement(By.xpath("//input[@name='q']"));
	          ele1.sendKeys("Mango");
	          ele1.sendKeys(Keys.ENTER);
	          String mango=driver.findElement(By.xpath("//a[@id='vs0p1']")).getText();
	          
	       return new Object[][]{{ apple, new Integer(1) }, { mango, new Integer(2)},};
	      }
	       
	      //This test method declares that its data should be supplied by the Data Provider
	      //named "test1"
	      @Test(dataProvider = "test1")
	      public void verifyData1(String n1, Integer n2) 
	      {
	       System.out.println(n1 + " " + n2);
	      }

	      
  }
