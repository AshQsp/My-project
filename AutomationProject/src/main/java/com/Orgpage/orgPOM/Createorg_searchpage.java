package com.Orgpage.orgPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createorg_searchpage
{
	@FindBy(xpath = "//input[@class='txtBox']")
	private WebElement orgsearchbox;
	
	@FindBy(name = "submit")
	private WebElement orgsearchbtn;
	 
	public Createorg_searchpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgsearchbox() {
		return orgsearchbox;
	}

	public WebElement getOrgsearchbtn() {
		return orgsearchbtn;
	}
	

}
