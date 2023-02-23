package com.flipkart.ObjectRepository;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.flipkart.genericUtility.ExcelUtility;

public class PhonePage 
{
	@FindBy(xpath="//div[@class='_4rR01T']")
	private List<WebElement> phoneNames;
	@FindBy(xpath="//div[@class='_4rR01T']/../..//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> phonePrices;
	public  PhonePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void phoneNamesIntoExcel(ExcelUtility excelUtility)
	{
		for(int i=0;i<phoneNames.size();i++)
		{
			String name = phoneNames.get(i).getText();
			excelUtility.setExcelData("Sheet2",i,0,name);


		}
	}
	public void phonePricesIntoExcel(ExcelUtility excelUtility)
	{
		for(int i=0;i<phonePrices.size();i++)
		{
			String name = phonePrices.get(i).getText();
			excelUtility.setExcelData("Sheet2",i,1,name);


		}

	}
}
