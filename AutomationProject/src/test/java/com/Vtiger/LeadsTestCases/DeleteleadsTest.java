package com.Vtiger.LeadsTestCases;

import org.testng.annotations.Test;

import com.AutomationProject.genric.BaseClass;
import com.AutomationProject.genric.Driver;
import com.AutomationProject.genric.WebDriverUtils;
import com.Vtiger.HomepagePOM.HomePage;
import com.Vtiger.LeadsPOM.Clicknamefor_delete;
import com.Vtiger.LeadsPOM.Clickondeletebtn;
import com.Vtiger.LeadsPOM.Clickoneditbtn;

public class DeleteleadsTest extends BaseClass
{
	Clicknamefor_delete cd;
	Clickondeletebtn cdb;
	@Test
	public void deletelead()
	{
		hmp=new HomePage(Driver.getDriver());
		wdu=new WebDriverUtils();
		cd=new Clicknamefor_delete(Driver.getDriver());
		cdb=new Clickondeletebtn(Driver.getDriver());
		hmp.getLeadsbtn().click();
		cd.getClickonnamefordelete().click();
		cdb.getClickondeletebtn().click();
	}

}
