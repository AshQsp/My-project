package com.Vtiger.LeadsTestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AutomationProject.genric.BaseClass;
import com.AutomationProject.genric.Driver;
import com.AutomationProject.genric.Excelutills;
import com.AutomationProject.genric.Iconstant;
import com.AutomationProject.genric.WebDriverUtils;
import com.Vtiger.HomepagePOM.HomePage;
import com.Vtiger.LeadsPOM.CreateleadFrompopup;
import com.Vtiger.LeadsPOM.Leadspage;

public class CreateleadfromdropdownlistTest extends BaseClass
{
	CreateleadFrompopup clp;
	Leadspage lp;
	@Test
	public void leadscreatpopup() throws Throwable
	{
		wdu=new WebDriverUtils();
		eu=new Excelutills();
		hmp=new HomePage(Driver.getDriver());
		lp=new Leadspage(Driver.getDriver());
		clp=new CreateleadFrompopup(Driver.getDriver());
		hmp.getLeadsbtn().click();
		WebElement ele=lp.getCreateleadfromdropdown();
		ele.click();
		wdu.selectbyIndex(lp.getCreateleadfromdropdown(), 10);
		clp.getCompanynamepopupbox().sendKeys(eu.singleDataFetch(Iconstant.excelpath, 4, 4, "Leads"));
		clp.getLastnamepopupbox().sendKeys(eu.singleDataFetch(Iconstant.excelpath, 4, 3, "Leads"));
		clp.getSavebtnpopup().click();
		
		
	}

}
