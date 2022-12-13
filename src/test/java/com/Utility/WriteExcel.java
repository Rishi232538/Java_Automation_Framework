package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public void writeExcel(String sheetname, String cellvalue, int row, int col) throws IOException {
		
		String Write_excel_projectPath = System.getProperty("user.dir");
		String excelPath =Write_excel_projectPath+"/excel/TestData.xlsx";
		
		File file = new File(excelPath);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheetname);
		
		//write data
		
		sheet.getRow(row).createCell(col).setCellValue(cellvalue);
		
		FileOutputStream fos = new FileOutputStream(new File(excelPath));
		
		
		wb.write(fos);
		
		wb.close();
		
		fos.close();
		
		
	}

}
