package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickondeletebtn
{
	@FindBy(name="Delete")
	private WebElement clickondeletebtn;
	
	public Clickondeletebtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickondeletebtn() {
		return clickondeletebtn;
	}
	

}
