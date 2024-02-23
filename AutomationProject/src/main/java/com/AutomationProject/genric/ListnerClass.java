package com.AutomationProject.genric;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerClass implements ITestListener
{
	ExtentReports er;
	ExtentTest test;
	ExtentSparkReporter esr;

	public void onFinish(ITestContext context) 
	{
		Reporter.log("project is finished",true);
		er.flush();
	}

	public void onStart(ITestContext context) 
	{
		Reporter.log("project is started",true);
		ExtentSparkReporter esr=new ExtentSparkReporter(Iconstant.reportpath);
		esr.config().setDocumentTitle("Vtiger report");
		esr.config().setReportName("Asish");
		esr.config().setTheme(Theme.DARK);
		esr.config().setTimeStampFormat("10:55");

		er=new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("windwos", "10");
		er.setSystemInfo("Browser","Chrome");
		er.setSystemInfo("System","HP");
	}

	public void onTestFailure(ITestResult result) 
	{
		WebDriverUtils wdu=new WebDriverUtils();
		Javautils ju=new Javautils();
		String testCaseName=result.getName();
		
		Reporter.log("test case is failed"+testCaseName,true);
		String path= Iconstant.ssPath+ju.currentTimeGenerated()+ju.dateGenerate()+".png";
		System.out.println(path);
		test.log(Status.FAIL, "test case failed"+testCaseName);
	try {
		wdu.screenshot(Driver.getDriver(), path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		String testCaseName=result.getName();
		Reporter.log("test case is skipped"+testCaseName,true);
		test.log(Status.SKIP,"test skipped"+testCaseName);
	}

	public void onTestStart(ITestResult result) 
	{
		String testCaseName=result.getName();
		Reporter.log("test case is started"+testCaseName,true);
		test=er.createTest(testCaseName);
	
	}

	public void onTestSuccess(ITestResult result) 
	{
		String testCaseName=result.getName();
		Reporter.log("test case executed succesfully"+testCaseName,true);
		test.log(Status.PASS, "test executed succesfully "+testCaseName);
	}

}
