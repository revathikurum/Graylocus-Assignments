package com.assignment3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverScriptGoogleSuggestions 
{
	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) throws IOException, InterruptedException
	{
		writeToExcel(enterSuggestion("Gray"),enterSuggestion("Solution"),enterSuggestion("Service"));
		/*List<String> list2=enterSuggestion("Solutions");
		List<String> list3=enterSuggestion("Services");*/
	}
	public static List<String> enterSuggestion(String word) throws InterruptedException
	{
		driver.get("http://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(word);
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//table[@class='gssb_m']//tr"));
		List<String> list=new ArrayList<>();
		for(WebElement suggestion:suggestions){
			System.out.println(suggestion.getText());
			list.add(suggestion.getText());
		}
		return list;
	}
	public static void writeToExcel(List<String> list1,List<String> list2, List<String>list3) throws IOException{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("$Sheet1");
		 XSSFRow myRow = null;
		 XSSFCell myCell = null;
		 for (int rowNum = 0; rowNum <list1.size();rowNum++)
		 {    
			 myRow =sheet.createRow(rowNum);
			 System.out.print("\n");
			 myCell = myRow.createCell(0);
			 myCell.setCellValue(list1.get(rowNum));
			 myCell = myRow.createCell(1);
			 myCell.setCellValue(list2.get(rowNum));
			 myCell = myRow.createCell(2);
			 myCell.setCellValue(list3.get(rowNum));

		 }
		 
		 FileOutputStream out = new FileOutputStream(new File("E://Files/Google.xlsx"));
		 workbook.write(out);
		 out.close();
		
	}
}
