package com.flipkart.genericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	protected FileUtility fileUtility;
	protected ExcelUtility excelUtility;
	protected JavaUtility javaUtility;
	protected WebDriverUtility webDriverUtility;
	protected WebDriver driver;
	protected long timeout;
	protected static WebDriver edriver;

	@BeforeClass(alwaysRun = true)
	public void classsetup()
	{
		fileUtility=new FileUtility();
		excelUtility=new ExcelUtility();
		javaUtility=new JavaUtility();
		webDriverUtility=new WebDriverUtility();
		
		fileUtility.openPropertyFile();

		
	    String browser=fileUtility.getDataFromPropertyFile(PropertyFileKeys.BROWSER.convertToString());
		String url=fileUtility.getDataFromPropertyFile(PropertyFileKeys.URL.convertToString());

		timeout=(Long)javaUtility.stringToAnyDataType(fileUtility.getDataFromPropertyFile(PropertyFileKeys.TIMEOUT.convertToString()),"long");
		

	
		excelUtility.openExcel();
		
		
		driver=webDriverUtility.launchApplication(browser, timeout, url);
		edriver=driver;

		
		
	}
	
//	@AfterClass(alwaysRun = true)
//	public void classTearDown()
//	{
//		fileUtility.closePropertyFile();
//		excelUtility.closeExcel();
//		webDriverUtility.closeBrowser();
//	}
	



}
