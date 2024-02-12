package com.cermati.ebay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage 
{
	WebDriver driver;
	public	CellPhonesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Cell Phones & Smartphones')]")
	private WebElement cellPhoneAndSmartPhoneLink;
	
	public WebElement getCellPhoneAndSmartPhoneLink() {
		return cellPhoneAndSmartPhoneLink;
	}

	
	
	
}
