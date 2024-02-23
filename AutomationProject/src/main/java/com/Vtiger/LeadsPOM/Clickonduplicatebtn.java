package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickonduplicatebtn 
{
	@FindBy(name = "Duplicate")
	private WebElement duplicatebtn;
	
	public Clickonduplicatebtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDuplicatebtn() {
		return duplicatebtn;
	}
	

}
