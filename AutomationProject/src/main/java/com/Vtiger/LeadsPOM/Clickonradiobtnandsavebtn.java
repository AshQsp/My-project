package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationProject.genric.Driver;

public class Clickonradiobtnandsavebtn 
{
	@FindBy(id="transfertoacc")
	private WebElement orgradiobtn;
	
	@FindBy(name = "Save")
	private WebElement clicksaveinconvertpage;
	
	public Clickonradiobtnandsavebtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgradiobtn() {
		return orgradiobtn;
	}

	public WebElement getClicksaveinconvertpage() {
		return clicksaveinconvertpage;
	}
	

}
