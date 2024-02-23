package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationProject.genric.Driver;

public class Clickon_anameforduplicate 
{
	@FindBy(linkText = "s")
	private WebElement clickname;
	
	public Clickon_anameforduplicate(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickname() {
		return clickname;
	}
	

}
