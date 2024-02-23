package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickoncoverttobtn 
{
	@FindBy(linkText = "Convert Lead")
	private WebElement convertbtn;
	
	public Clickoncoverttobtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getConvertbtn() {
		return convertbtn;
	}
	

}
