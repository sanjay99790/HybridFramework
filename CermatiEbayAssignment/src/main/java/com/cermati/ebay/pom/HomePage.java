package com.cermati.ebay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	public	HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[text() = \" Shop by category\"]" )
	private WebElement categoryButton;
	
	@FindBy (xpath = "//a[normalize-space()='Cell phones & accessories']")
	private WebElement electronicsLink;
	
	
	public WebElement getCategoryButton() {
		return categoryButton;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	
	
	
}
