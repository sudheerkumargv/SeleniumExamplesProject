package com.selenium.utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil 
{

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	int sheetNo;
	String filePath;
	
	public ExcelUtil(String filePath,int sheetNo)
	{
		this.filePath = filePath;
		this.sheetNo = sheetNo;
		loadExcel();
	}

	
	public void loadExcel()
	{
		 File file = new File(filePath);
		 try {
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(sheetNo);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int getNoOfRows()
	{
		return sheet.getLastRowNum();
	}
	
	public String getCellValue(int rowNo,int colNo)
	{
		XSSFRow row = sheet.getRow(rowNo);
		XSSFCell cell = row.getCell(colNo);
		return cell.toString().trim();
	}
	
	
}