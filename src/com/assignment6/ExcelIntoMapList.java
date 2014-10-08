package com.assignment6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


public class ExcelIntoMapList 
{
	//static File filePath = new File("E://Files/Map.xls");
	
	public void maplistExcel() throws IOException
	{
			FileInputStream fin = new FileInputStream("E://Files/Map.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(fin);
			HSSFSheet sheet = workbook.getSheetAt(0);
			
			Map<String, List<String>> map = new TreeMap<String, List<String>>();
			int rowCount = sheet.getLastRowNum();
			Cell cell = null;
			for (int row = 1; row <rowCount; row++) {
				List<String> list = new ArrayList<String>();
				cell = sheet.getRow(row).getCell(0);
				String testCaseID = cell.getStringCellValue().trim();
		
				cell = sheet.getRow(row).getCell(1);
				list.add(cell.getStringCellValue().trim());
				cell = sheet.getRow(row).getCell(2);
				list.add(cell.getStringCellValue().trim());
				cell = sheet.getRow(row).getCell(3);
				list.add(cell.getStringCellValue().trim());
				map.put(testCaseID, list);
				
	}
	System.out.println(map);

	fin.close();
}

public static void main(String[] args) {

	ExcelIntoMapList map = new ExcelIntoMapList();

	try {
		map.maplistExcel();

	} catch (IOException e) {
	
		e.printStackTrace();
	}

}

}

	
