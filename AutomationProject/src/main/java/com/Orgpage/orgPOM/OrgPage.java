package com.Orgpage.orgPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage 
{
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement orgplusbtn;
	
	public OrgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgplusbtn() {
		return orgplusbtn;
	}

	

}
