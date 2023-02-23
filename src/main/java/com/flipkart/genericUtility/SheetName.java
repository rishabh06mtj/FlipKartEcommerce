package com.flipkart.genericUtility;

public enum SheetName {

	SHEET1("Sheet1");
	private String sheetName;

	private SheetName(String sheetName)
	{
		this.sheetName=sheetName;
	}
	
	public String convertToString(){

		return sheetName.toString(); 
	}
	
}
