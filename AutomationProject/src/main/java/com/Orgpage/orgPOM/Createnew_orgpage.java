package com.Orgpage.orgPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnew_orgpage
{
	@FindBy(name = "accountname")
	private WebElement orgnametextbox;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement orgsavebtn;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement memplusbtn;
	
	public Createnew_orgpage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}

	public WebElement getOrgnametextbox() {
		return orgnametextbox;
	}

	public WebElement getOrgsavebtn() {
		return orgsavebtn;
	}

	public WebElement getMemplusbtn() {
		return memplusbtn;
	}
	

}
