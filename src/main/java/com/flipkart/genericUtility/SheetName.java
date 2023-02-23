package com.flipkart.genericUtility;

public enum SheetName {

	CLIENTS("Clients");
	private String sheetName;

	private SheetName(String sheetName)
	{
		this.sheetName=sheetName;
	}
	
	public String convertToString(){

		return sheetName.toString(); 
	}
	
}
