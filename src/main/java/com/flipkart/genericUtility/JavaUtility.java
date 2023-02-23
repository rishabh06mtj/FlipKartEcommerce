 package com.flipkart.genericUtility;

import java.util.Random;

public class JavaUtility {
	
	public Object stringToAnyDataType(String s,String strategy)
	{
		Object convertedData=null;
		if(strategy.equals("int"))
		{
			convertedData=Integer.parseInt(s);
		}
		else if(strategy.equals("long"))
		{
			convertedData=Long.parseLong(s);
		}

		return	convertedData;
	}
	public int getRandomNumber(int limit)
	{
		int randomNumber=new Random().nextInt(limit);
		return randomNumber;
	}
	
	}
	

	
	



