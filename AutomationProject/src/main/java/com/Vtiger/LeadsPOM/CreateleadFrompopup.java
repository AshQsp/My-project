package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateleadFrompopup 
{
	@FindBy(name = "lastname")
	private WebElement lastnamepopupbox;
	
	@FindBy(name = "company")
	private WebElement companynamepopupbox;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtnpopup;
	
	public CreateleadFrompopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLastnamepopupbox() {
		return lastnamepopupbox;
	}

	public WebElement getCompanynamepopupbox() {
		return companynamepopupbox;
	}

	public WebElement getSavebtnpopup() {
		return savebtnpopup;
	}
	

}
