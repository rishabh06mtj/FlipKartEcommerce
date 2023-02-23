package testscripts;
import org.testng.annotations.Test;
import com.flipkart.ObjectRepository.HomePage;
import com.flipkart.genericUtility.BaseClass;

public class BuyTheProduct extends BaseClass
{
@Test
public void makePayment()
{
	HomePage homePage=new HomePage(driver);
	homePage.cancelThePopup();
	homePage.typeInSearchTextBox();
	homePage.clickOnSearchButton();
	homePage.searchforItem();
	String data=excelUtility.getDataFromExcel("Sheet1",1,0);
	webDriverUtility.swithToWindow(driver,data);
	homePage.buyNow();
	
}
}
