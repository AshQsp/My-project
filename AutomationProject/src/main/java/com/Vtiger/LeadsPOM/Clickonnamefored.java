package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickonnamefored 
{
	@FindBy(linkText = "Nayak")
	private WebElement clicknameedit;
	
	public Clickonnamefored(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClicknameedit() {
		return clicknameedit;
	}
	

}
