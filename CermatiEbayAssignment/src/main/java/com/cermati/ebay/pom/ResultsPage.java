package com.cermati.ebay.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultsPage
{
  
	WebDriver driver;
	public	ResultsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[text()=\"3 filters applied\"]")
	private WebElement filtersApplied;
	
	@FindBy(xpath = "//span[text()=\"Cell Phones & Smartphones between US $100.00 and US $200.00\"]")
	private WebElement confirmationMesasage;
	
	public void assertFilterMessage()
	{
		String actualText = filtersApplied.getText();
		Assert.assertEquals(actualText, "3 filters applied");
		System.out.println("Message : 3 filters applied ");
		
	}
	
	public void assertConfirmationMessage()
	{
		String actualText = confirmationMesasage.getText();
		Assert.assertEquals(actualText,"Cell Phones & Smartphones between US $100.00 and US $200.00");
		System.out.println("Message : Price  Filters Applied Successfully");
	}
}
