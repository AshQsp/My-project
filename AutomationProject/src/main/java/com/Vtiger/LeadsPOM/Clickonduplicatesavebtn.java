package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickonduplicatesavebtn
{
	@FindBy(name = "button")
	private WebElement duplicatesavebtn;
	
	public Clickonduplicatesavebtn(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDuplicatesavebtn() {
		return duplicatesavebtn;
	}
	

}
