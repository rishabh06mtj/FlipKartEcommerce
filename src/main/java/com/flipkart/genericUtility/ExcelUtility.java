package com.flipkart.genericUtility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	private  Workbook workbook;
	private	FileInputStream fisExcel;
	private FileOutputStream fos;
	private DataFormatter df;
	public void openExcel()
	{
		try {
			fisExcel = new FileInputStream(IConstantPath.EXCEL_PATH);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}
		try {
			workbook=WorkbookFactory.create(fisExcel);
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}


	}
	
	public String getDataFromExcel(String sheetName,int rowNumber,int cellNumber)
	{
		df=new DataFormatter();
		String data=df.formatCellValue(workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber));
		return data;
	}

	public void closeExcel()
	{
		try {
			fisExcel.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			workbook.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
