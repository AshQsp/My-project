package com.Vtiger.LeadsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationProject.genric.Driver;

public class Create_new_leads_page 
{
	WebDriver driver;
	@FindBy(name = "lastname")
	private WebElement lastnameTextbox;
	
	@FindBy(name="company")
	private WebElement companyTextbox;
	
	@FindBy(name = "firstname")
	private WebElement fnameTextBox;
	
	@FindBy(name = "designation")
	private WebElement titletextBox;
	
	@FindBy(name = "salutationtype")
	private WebElement dropDownNameTextBox;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebutn;
	
	public Create_new_leads_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver()
	{
		return driver;
	}

	public void setDriver(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebElement getLastnameTextbox() 
	{
		return lastnameTextbox;
	}

	public void setLastnameTextbox(WebElement lastnameTextbox)
	{
		this.lastnameTextbox = lastnameTextbox;
	}

	public WebElement getCompanyTextbox() {
		return companyTextbox;
	}

	public void setCompanyTextbox(WebElement companyTextbox) {
		this.companyTextbox = companyTextbox;
	}

	public WebElement getSavebutn() 
	{
		return savebutn;
	}

	public void setSavebutn(WebElement savebutn)
	{
		this.savebutn = savebutn;
	}

	public WebElement getFnameTextBox() {
		return fnameTextBox;
	}

	public void setFnameTextBox(WebElement fnameTextBox) {
		this.fnameTextBox = fnameTextBox;
	}

	public WebElement getTitletextBox() {
		return titletextBox;
	}

	public void setTitletextBox(WebElement titletextBox) {
		this.titletextBox = titletextBox;
	}

	public WebElement getDropDownNameTextBox() {
		return dropDownNameTextBox;
	}

	public void setDropDownNameTextBox(WebElement dropDownNameTextBox) {
		this.dropDownNameTextBox = dropDownNameTextBox;
	}
	
	

}
