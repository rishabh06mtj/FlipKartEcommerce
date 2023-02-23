package com.flipkart.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

private	FileInputStream fis;
private Properties property;

public void openPropertyFile()
{
	try {
		fis = new FileInputStream(IConstantPath.PROPERTYFILE_PATH);
	} catch (FileNotFoundException e1) {
		
		e1.printStackTrace();
	}
	property=new Properties();
	try {
		property.load(fis);
	} catch (IOException e) 
	{
		e.printStackTrace();
	}


}

	public String getDataFromPropertyFile(String key) {
	
	String value=property.getProperty(key);
	return value;
	}
	
	
	public void closePropertyFile()
	{
	try {
		fis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		}
}
