package com.assignment31p;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Set1 
{
	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8888/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		driver.findElement(By.xpath("(//a[.='Leads'])[1]")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		
		WebElement e = driver.findElement(By.xpath("(//select[@class='small'])[2]"));
		Select se = new Select(e);
		se.selectByIndex(2);
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("Revathi");
		
		driver.findElement(By.xpath("(//input[@id='mobile'])")).sendKeys("9164169134");
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[5]")).sendKeys("GrayLocus Solutions");
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[3]")).sendKeys("Kurum");
		
		driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("Software Enginner");
		
		driver.findElement(By.xpath("//input[@id='noofemployees']")).sendKeys("50");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("revathi.k@graylocus.com");
		
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		
		driver.navigate().back();
		
		WebElement e1 = driver.findElement(By.xpath("(//select[@class='small'])[2]"));
		Select se1 = new Select(e1);
		se1.selectByIndex(1);
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("Harish Yadav");
		
		driver.findElement(By.xpath("(//input[@id='mobile'])")).sendKeys("9535311718");
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[5]")).sendKeys("Wipro");
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[3]")).sendKeys("Gorla");
		
		driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("Team Lead");
		
		driver.findElement(By.xpath("//input[@id='noofemployees']")).sendKeys("20000");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harish.gorla@wipro.com");
		
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		
		driver.navigate().back();
		
		WebElement e2 = driver.findElement(By.xpath("(//select[@class='small'])[2]"));
		Select se2 = new Select(e2);
		se2.selectByIndex(2);
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("Sujitha");
		
		driver.findElement(By.xpath("(//input[@id='mobile'])")).sendKeys("8050236921");
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[5]")).sendKeys("TCS");
		
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[3]")).sendKeys("Gorla");
		
		driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("Software Engineer");
		
		driver.findElement(By.xpath("//input[@id='noofemployees']")).sendKeys("40000");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sugitha.gorla@tcs.com");
		
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("revathi.k@graylocus.com");
		
		WebElement e3 = driver.findElement(By.xpath("//select[@id='bas_searchfield']"));
		Select se3 = new Select(e3);
		se3.selectByIndex(6);
		
		driver.findElement(By.xpath("//input[@class='crmbutton small create']")).click();
		
		driver.findElement(By.xpath("//td[@class='small']")).click();		
	
				String expectedTitle = "Welcome to HomePage";
				String actualTitle = driver.getTitle();
				if(actualTitle.equals(expectedTitle))
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("FAIL");
				}
			}
	}

