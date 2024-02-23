package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clicknamefor_delete 
{
	@FindBy(linkText = "Tata")
	private WebElement clickonnamefordelete;
	
	public Clicknamefor_delete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickonnamefordelete() {
		return clickonnamefordelete;
	}
	

}
