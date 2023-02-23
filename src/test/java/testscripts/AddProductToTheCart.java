package testscripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.flipkart.ObjectRepository.HomePage;
import com.flipkart.genericUtility.BaseClass;

public class AddProductToTheCart extends BaseClass
{
	@Test
	public void addProductToTheCart()
	{

		HomePage homePage=new HomePage(driver);
		homePage.cancelThePopup();
		homePage.mouseHoverToElectronics(webDriverUtility);
		homePage.selectPowerBAnk();
		homePage.clickOnRatingCheckBox();
		homePage.waitForPowerBank(webDriverUtility, timeout);
		homePage.clickOnParticularMobile(webDriverUtility);
		
		String data=excelUtility.getDataFromExcel("Sheet1",2,0);
		webDriverUtility.swithToWindow(driver,data);
		homePage.clickOnAddToCart();
	    boolean flag=homePage.compareTheProductAndValidate(data);
	    Assert.assertTrue(flag);
	
		

	}
}
