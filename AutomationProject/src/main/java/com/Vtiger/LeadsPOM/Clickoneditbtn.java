package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickoneditbtn 
{
	@FindBy(name = "Edit")
	private WebElement clickonedit;
	
	public Clickoneditbtn(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public WebElement getClickonedit() {
		return clickonedit;
	}
	

}
