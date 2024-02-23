package com.AutomationProject.genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver 
{
	static WebDriver driver;
	static ThreadLocal<WebDriver> th =new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return th.get();
	}
	public static void setDriver(WebDriver driver)
	{
		th.set(driver);
	}
	
	public void driverLaunch(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			setDriver(driver);
		}
		if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			setDriver(driver);
		}
		
	}

}
