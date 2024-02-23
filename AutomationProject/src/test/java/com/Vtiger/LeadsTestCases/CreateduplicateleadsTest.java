package com.Vtiger.LeadsTestCases;

import org.testng.annotations.Test;

import com.AutomationProject.genric.BaseClass;
import com.AutomationProject.genric.Driver;
import com.AutomationProject.genric.WebDriverUtils;
import com.Vtiger.HomepagePOM.HomePage;
import com.Vtiger.LeadsPOM.Clickon_anameforduplicate;
import com.Vtiger.LeadsPOM.Clickonduplicatebtn;
import com.Vtiger.LeadsPOM.Clickonduplicatesavebtn;

public class CreateduplicateleadsTest extends BaseClass
{
	Clickon_anameforduplicate cnd;
	Clickonduplicatebtn cdc;
	Clickonduplicatesavebtn cds;
	@Test
	public void duplicatelead()
	{
		wdu=new WebDriverUtils();
		hmp=new HomePage(Driver.getDriver());
		cnd=new Clickon_anameforduplicate(Driver.getDriver());
		cdc=new Clickonduplicatebtn(Driver.getDriver());
		cds=new Clickonduplicatesavebtn(Driver.getDriver());
		hmp.getLeadsbtn().click();
		cnd.getClickname().click();
		cdc.getDuplicatebtn().click();
		cds.getDuplicatesavebtn().click();
		
	}

}
