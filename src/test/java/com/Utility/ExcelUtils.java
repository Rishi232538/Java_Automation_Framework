package com.Utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	 static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public ExcelUtils() {
		try {
		
			String projectPath = System.getProperty("user.dir");
	       workbook = new XSSFWorkbook(projectPath+"/excel/TestData.xlsx");
		      sheet = workbook.getSheet("sheet1");
		}catch(Exception e) {
			e.printStackTrace();
		}
	                                                       }

	public static int getRowCount() throws IOException {
		int rowCount =0;
		try {
		 rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No.of.rows: "+rowCount);
		    }
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
		                     }
		return rowCount;
		
	                                                    }

	public String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		try {
			     cellData =sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			     System.out.println(cellData);
		    } 
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
		
	                               }
		return cellData;
	                                                               }
	
public Object getCellDataNumber(int rowNum, int colNum) {
	Object cellData = 0;
		try {
			 cellData =sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			     System.out.println(cellData);
		    }
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
		
	                          }
	     return cellData;                                                     }
	
}
