package com.cermati.ebay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesAndSmartPhonesPage 
{
	WebDriver driver;
	public	CellPhonesAndSmartPhonesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@aria-label='All Filters']")
	private WebElement allFiltersButton;
	
	@FindBy(id = "c3-mainPanel-condition")
	private WebElement conditionOption;
	
	@FindBy(id= "c3-subPanel-LH_ItemCondition_New_cbx")
	private WebElement newOption;
	
	@FindBy(xpath = "//div[@id='c3-mainPanel-price']")
	private WebElement priceOption;
	
	@FindBy(xpath = "//input[@aria-label='Minimum Value, US Dollar']")
	private WebElement priceMinTextBox;
	
	@FindBy(xpath = "//input[@aria-label='Maximum Value, US Dollar']")
	private WebElement priceMaxTextBox;
	
	@FindBy(xpath = "//span[normalize-space()='Item Location']")
	private WebElement locationOption;
	
	@FindBy(css = "input[value='North America']")
	private WebElement locationAmericaOption;
	
	@FindBy(xpath= "//button[@aria-label='Apply']")
	private WebElement  applyButton;
	
	public WebElement getAllFiltersButton() {
		return allFiltersButton;
	}

	public WebElement getConditionOption() {
		return conditionOption;
	}

	public WebElement getNewOption() {
		return newOption;
	}

	public WebElement getPriceOption() {
		return priceOption;
	}

	public WebElement getPriceMinTextBox() {
		return priceMinTextBox;
	}

	public WebElement getPriceMaxTextBox() {
		return priceMaxTextBox;
	}

	public WebElement getLocationOption() {
		return locationOption;
	}

	public WebElement getLocationAmericaOption() {
		return locationAmericaOption;
	}

	public WebElement getApplyButton() {
		return applyButton;
	}
	
}
