package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadspage 
{
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement plusbtn;
	
	@FindBy(id = "qccombo")
	private WebElement createleadfromdropdown;
	
	@FindBy(xpath  = "//a[text()='SS']")
	private WebElement clickonname;
	
	public Leadspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getPlusbtn()
	{
		return plusbtn;
	}

	public WebElement getCreateleadfromdropdown() {
		return createleadfromdropdown;
	}

	public WebElement getClickonname() {
		return clickonname;
	}
	

}
