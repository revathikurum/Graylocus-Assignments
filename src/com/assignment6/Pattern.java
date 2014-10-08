package com.assignment6;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pattern 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8888/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Username and password
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		//Produts
		driver.findElement(By.xpath("(//a[.='Products'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("TestProduct");
		
		WebElement UnitPrice= driver.findElement(By.xpath("//input[@id='unit_price']"));
		UnitPrice.sendKeys("6");
		String UnitPrice1 = UnitPrice.getAttribute("value");
		System.out.println("UnitPrice:" + UnitPrice1);
		
		driver.findElement(By.xpath("//input[@id='tax1_check']")).click();
		WebElement vat = driver.findElement(By.xpath("//input[@value='4.500']"));
		vat.getAttribute("value"); 
		String vat1 = vat.getText();
	
		driver.findElement(By.xpath("//input[@id='tax2_check']")).click();
		WebElement sales = driver.findElement(By.xpath("//input[@value='10.000']"));
		sales.getAttribute("value");
		String sales1 = sales.getText();
	
		driver.findElement(By.xpath("//input[@id='tax3_check']")).click();
		WebElement service = driver.findElement(By.xpath("//input[@value='12.500']"));
		service.getAttribute("value");
		String service1 = service.getText();
		
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		driver.findElement(By.linkText("More")).click();
        driver.findElement(By.linkText("Vendors")).click();
        driver.findElement(By.xpath("//img[@title='Create Vendor...']")).click();
        driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("TestVendor");
         driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
        
        driver.findElement(By.linkText("More")).click();
        driver.findElement(By.linkText("Purchase Order")).click();
        
        driver.findElement(By.xpath("//img[@title='Create Purchase Order...']")).click();
        
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("(//img[contains(@src,'softed')])[16]")).click();
        
        
        Set<String> list = driver.getWindowHandles();
        
        for(String child:list)
        {
        	driver.switchTo().window(child);
        }
        driver.findElement(By.linkText("TestVendor")).click();
        
       Set<String> list1 = driver.getWindowHandles();
        
        for(String child1:list1)
        {
        	driver.switchTo().window(child1);
        }
        /*driver.close();
        driver.switchTo().window(parent);*/
        
        driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
        
        Set<String> list2 = driver.getWindowHandles();
        
        for(String child2:list2)
        {
        	driver.switchTo().window(child2);
        }
        
        driver.findElement(By.linkText("TestProduct")).click();
        
        Set<String> list3 = driver.getWindowHandles();
        
        for(String child3:list3)
        {
        	driver.switchTo().window(child3);
        }
        WebElement Qty = driver.findElement(By.xpath("//input[@id='qty1']"));
		Qty.sendKeys("4");
		String Qty1 = Qty.getAttribute("value");
		System.out.println("Quantity is:" + Qty1);
		
        Iterator<String> windowIterator =  driver.getWindowHandles().iterator();
        while(windowIterator.hasNext()) { 
     	  String windowHandle = windowIterator.next(); 
     	  WebDriver popup = driver.switchTo().window(windowHandle);
     	  Object title = null;
		if (popup.getTitle().equals(title)) {
     break;
     	  }
      }  
        driver.findElement(By.xpath("//input[@id='listPrice1']")).click();
        WebElement grandtotal =  driver.findElement(By.xpath("//td[@id='grandTotal']"));
        String grandtotal1 = grandtotal.getText();
        System.out.println("grandtotal:"+grandtotal);
        
        int unitPrice3 = Integer.parseInt(UnitPrice1);
        double vat3 = Integer.parseInt(vat1);
        int sales3 = Integer.parseInt(sales1);
        int service3 = Integer.parseInt(service1);
        int Qty3 = Integer.parseInt(Qty1);
        int grandtotal3 = Integer.parseInt(grandtotal1);
        
        int total = unitPrice3*Qty3;
        
        double vat2 = total*(vat3/100);
        int sales2 = total*(sales3/100);
        int service2 = total*(service3/100);
        
        double totalprice = vat2+sales2+service2;
        
        if(totalprice==grandtotal3)
        {
        	System.out.println("both same:"+totalprice+ "and " + grandtotal3);
        }
        else
        {
        	System.out.println("not same");
        }
        
}
	
}
