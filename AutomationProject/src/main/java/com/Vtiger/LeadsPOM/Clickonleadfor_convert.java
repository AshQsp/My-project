package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickonleadfor_convert 
{
	@FindBy(linkText = "Nayak")
	private WebElement clickonnameforconv;
	
	public Clickonleadfor_convert(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickonnameforconv() {
		return clickonnameforconv;
	}
	

}
