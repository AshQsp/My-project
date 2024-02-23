package com.AutomationProject.genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Vtiger.HomepagePOM.HomePage;
import com.Vtiger.LoginPOM.LoginPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	//public  static WebDriver driver;
	public WebDriverUtils wdu;
	public PropertyUtils pru;
	public LoginPages lgp;
	public HomePage hmp;
	public Excelutills eu;
	public Javautils ju;
	Driver d;
	
	@BeforeClass
	public void setup() throws Throwable
	{
		wdu=new WebDriverUtils();
		pru=new PropertyUtils();
		d=new Driver();
		d.driverLaunch(Iconstant.chromeLaunch);
		//WebDriverManager.chromedriver().setup();
		//driver()=new ChromeDriver();
		wdu.implicit_wait(Driver.getDriver(),10);
		wdu.MaximizeBrowser(Driver.getDriver());
		wdu.openapp(Driver.getDriver(), pru.fetchDataFromProperty(Iconstant.propVitger_path,"url"));
		
	}
	@BeforeMethod
	public void loginApp() throws Throwable
	{
		wdu=new WebDriverUtils();
		pru=new PropertyUtils();
		lgp=new LoginPages(Driver.getDriver());
		lgp.getUn().sendKeys(pru.fetchDataFromProperty(Iconstant.propVitger_path,"un"));
		lgp.getPwd().sendKeys(pru.fetchDataFromProperty(Iconstant.propVitger_path,"pwd"));
		lgp.getLogin().click();
	}
	
	@AfterMethod
	public void logout()
	{
		wdu=new WebDriverUtils();
		pru=new PropertyUtils();
		hmp=new HomePage(Driver.getDriver());
		wdu.moveTheCursor(Driver.getDriver(),hmp.getAdminimg());
		hmp.getSignout().click();
	}
	@AfterClass
	public void tearUp()
	{
		Driver.getDriver().close();
	}
	

}
