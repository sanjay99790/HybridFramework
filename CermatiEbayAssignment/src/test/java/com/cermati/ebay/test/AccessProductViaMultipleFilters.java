package com.cermati.ebay.test;

import org.testng.annotations.Test;

import com.cermati.ebay.genericutility.BaseClass;
import com.cermati.ebay.pom.CellPhonesAndSmartPhonesPage;
import com.cermati.ebay.pom.CellPhonesPage;
import com.cermati.ebay.pom.HomePage;
import com.cermati.ebay.pom.ResultsPage;

public class AccessProductViaMultipleFilters extends BaseClass
{

	@Test
	public void accessProductCategoryAfterApplyingMultipleFilters()
	{
		HomePage homePage = new HomePage(driver);
		homePage.getCategoryButton().click();
		homePage.getElectronicsLink().click();
		
		CellPhonesPage cellPhone = new CellPhonesPage(driver);
		cellPhone.getCellPhoneAndSmartPhoneLink().click();
		
		CellPhonesAndSmartPhonesPage cellPhonesAndSmartPhonesPage = new CellPhonesAndSmartPhonesPage(driver);
		cellPhonesAndSmartPhonesPage.getAllFiltersButton().click();
		cellPhonesAndSmartPhonesPage.getConditionOption().click();
		cellPhonesAndSmartPhonesPage.getNewOption().click();
		
		cellPhonesAndSmartPhonesPage.getPriceOption().click();
		cellPhonesAndSmartPhonesPage.getPriceMinTextBox().sendKeys("100");
		cellPhonesAndSmartPhonesPage.getPriceMaxTextBox().sendKeys("200");
		cellPhonesAndSmartPhonesPage.getLocationOption().click();
		cellPhonesAndSmartPhonesPage.getLocationAmericaOption().click();
		cellPhonesAndSmartPhonesPage.getApplyButton().click();
		
		ResultsPage resultspage = new ResultsPage(driver);
		resultspage.assertFilterMessage();
		resultspage.assertConfirmationMessage();
	}
}
