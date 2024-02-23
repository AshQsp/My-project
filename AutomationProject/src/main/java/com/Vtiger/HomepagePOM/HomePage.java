package com.Vtiger.HomepagePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(linkText="Calendar")
	private WebElement calbtn;
	
	@FindBy(linkText ="Leads")
	private WebElement leadsbtn;
	
	@FindBy(linkText = "Organizations")
	private WebElement orgbtn;
	 
	@FindBy(linkText = "Contacts")
	private WebElement contbtn;
	
	@FindBy(xpath = "//span[text()=' Administrator']/../following::td/img")
	private WebElement adminimg;

	@FindBy(id="qccombo")
	private WebElement creatleadbydropdown;
	
	
	
	@FindBy(linkText = "Sign Out")
	private WebElement signout;
	


	

	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCalbtn() 
	{
		return calbtn;
	}

	public void setCalbtn(WebElement calbtn)
	{
		this.calbtn = calbtn;
	}

	public WebElement getLeadsbtn()
	{
		return leadsbtn;
	}

	public void setLeadsbtn(WebElement leadsbtn) 
	{
		this.leadsbtn = leadsbtn;
	}

	public WebElement getOrgbtn() 
	{
		return orgbtn;
	}

	public void setOrgbtn(WebElement orgbtn)
	{
		this.orgbtn = orgbtn;
	}

	public WebElement getContbtn()
	{
		return contbtn;
	}

	public void setContbtn(WebElement contbtn)
	{
		this.contbtn = contbtn;
	}

	public WebElement getAdminimg() 
	{
		return adminimg;
	}

	public void setAdminimg(WebElement adminimg)
	{
		this.adminimg = adminimg;
	}

	public WebElement getSignout() 
	{
		return signout;
	}

	public void setSignout(WebElement signout)
	{
		this.signout = signout;
	}
	
	public WebElement getCreatleadbydropdown() {
		return creatleadbydropdown;
	}

	
	

}
