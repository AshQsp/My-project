package com.Orgpage.orgPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInformationpage 
{
	@FindBy(className ="dvHeaderText")
	private WebElement Validateorginfopage;
	
	public OrgInformationpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}

	public WebElement getValidateorginfopage() {
		return Validateorginfopage;
	}
	
	
	

}
