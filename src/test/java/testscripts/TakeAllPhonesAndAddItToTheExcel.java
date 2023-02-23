package testscripts;

import org.testng.annotations.Test;

import com.flipkart.ObjectRepository.HomePage;
import com.flipkart.ObjectRepository.PhonePage;
import com.flipkart.genericUtility.BaseClass;

public class TakeAllPhonesAndAddItToTheExcel extends BaseClass
{
	@Test
	public void addToExcel()
	{
		HomePage homePage=new HomePage(driver);
		PhonePage phonePage=new PhonePage(driver);
		homePage.cancelThePopup();
		homePage.searchTextBox("iphone");
		homePage.clickOnSearchButton();
		phonePage.phoneNamesIntoExcel(excelUtility);
		phonePage.phonePricesIntoExcel(excelUtility);	

	}


}




