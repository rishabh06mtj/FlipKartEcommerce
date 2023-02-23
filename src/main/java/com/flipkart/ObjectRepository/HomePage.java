package com.flipkart.ObjectRepository;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.flipkart.genericUtility.WebDriverUtility;

public class HomePage
{
@FindBy(name="q")
private WebElement searchTextBox;
@FindBy(xpath ="//button[@type='submit']")
private WebElement searchIcon;
@FindBy(xpath ="//div[text()='APPLE iPhone 11 (White, 128 GB)']")
private WebElement searchforItem;
@FindBy(xpath ="//button[text()='Buy Now' and @type='button']")
private WebElement buyNow;
@FindBy(xpath ="//button[text()='✕']")
private WebElement cancelThePopup;
@FindBy(xpath ="//div[text()='Electronics']")
private WebElement mouseHoverToElectronics;
@FindBy(xpath ="//div[@class='_3XS_gI _7qr1OC']/a[text()='Powerbank']")
private WebElement selectPowerBAnk;
@FindBy(xpath ="//div[@title='4★ & above']/descendant::div[@class='_24_Dny']")
private WebElement clickOnRatingCheckBox;
@FindBy(xpath ="//div[text()='Blue, Lithium Polymer']/preceding-sibling::a[text()='Mi 3i 10000 mAh Power Bank (Fast Charging, 18W)' and @class='s1Q9rs']")
private WebElement clickOnParticularMobile;
@FindBy(xpath ="//button[text()='Add to cart']")
private WebElement clickOnAddToCart;
@FindBy(xpath ="//a[@class='_2Kn22P gBNbID']")
private List<WebElement> listOfProducts;

public  HomePage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}

public void typeInSearchTextBox() 
{
	searchTextBox.sendKeys("iphone");
}
public void clickOnSearchButton() 
{
	searchIcon.click();
}
public void searchforItem() 
{
	searchforItem.click();
}
public void buyNow() 
{
	buyNow.click();
}
public void cancelThePopup() 
{
	cancelThePopup.click();
}
public void mouseHoverToElectronics(WebDriverUtility webDriverUtility) 
{
	webDriverUtility.action_mouseHover(mouseHoverToElectronics);
}
public void selectPowerBAnk() 
{
	selectPowerBAnk.click();
}
public void clickOnRatingCheckBox() 
{
	clickOnRatingCheckBox.click();
}
public void clickOnParticularMobile(WebDriverUtility webDriverUtility) 
{
	webDriverUtility.implicitlyWait();
	clickOnParticularMobile.click();
}
public void clickOnAddToCart()
{
	clickOnAddToCart.click();
}
public boolean compareTheProductAndValidate(String product)
{
	 for(WebElement webelement:listOfProducts)
	  {
		  String product1 = webelement.getText();
		  
		  if(product1.equals(product))
		  {
			return true;
		  }
		
	  }
	return false; 	
}







	
	
}
