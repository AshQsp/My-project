package com.Vtiger.orgTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.AutomationProject.genric.BaseClass;
import com.AutomationProject.genric.Driver;
import com.AutomationProject.genric.Excelutills;
import com.AutomationProject.genric.Iconstant;
import com.AutomationProject.genric.Javautils;
import com.AutomationProject.genric.WebDriverUtils;
import com.Orgpage.orgPOM.Createnew_orgpage;
import com.Orgpage.orgPOM.Createorg_searchpage;
import com.Orgpage.orgPOM.OrgInformationpage;
import com.Orgpage.orgPOM.OrgPage;
import com.Vtiger.HomepagePOM.HomePage;

public class CreateorgAndCheck  extends BaseClass
{
	Createnew_orgpage cno;
	OrgInformationpage oip;
	OrgPage op;
	Createorg_searchpage cosp;
	
	@Test
	public void createorgand_checkmemberispresentornot() throws Throwable
	{
		wdu=new WebDriverUtils();
		hmp=new HomePage(Driver.getDriver());
		cno=new Createnew_orgpage(Driver.getDriver());
		oip=new OrgInformationpage(Driver.getDriver());
		op=new OrgPage(Driver.getDriver());
		eu=new Excelutills();
		ju=new Javautils();
		hmp.getOrgbtn().click();
		op.getOrgplusbtn().click();
		String randomstring=eu.singleDataFetch(Iconstant.excelpath, 2, 3, "Org")+ju.randoNumber(10000);
		cno.getOrgnametextbox().sendKeys(randomstring);
		cno.getOrgsavebtn().click();
		String actdata=oip.getValidateorginfopage().getText();
		Assert.assertTrue(actdata.contains(randomstring),"My Organization Page is Not Created" );
		Reporter.log(randomstring);
		wdu.backPage(Driver.getDriver());
		cno.getMemplusbtn().click();
		wdu.multiple_window_handle(Driver.getDriver(),"http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
		cosp.getOrgsearchbox().sendKeys("Asish");
		
	}
	

}
