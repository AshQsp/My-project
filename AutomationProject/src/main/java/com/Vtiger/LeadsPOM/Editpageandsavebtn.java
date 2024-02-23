package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editpageandsavebtn 
{
	@FindBy(name="firstname")
	private WebElement firstnameboxineditpage;
	
	@FindBy(name="button")
	private WebElement clickonsavebtnineditpage;
	
	public Editpageandsavebtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameboxineditpage() {
		return firstnameboxineditpage;
	}

	public WebElement getClickonsavebtnineditpage() {
		return clickonsavebtnineditpage;
	}
	

}
