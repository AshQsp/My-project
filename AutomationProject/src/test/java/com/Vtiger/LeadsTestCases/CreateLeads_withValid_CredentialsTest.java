package com.Vtiger.LeadsTestCases;


import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.AutomationProject.genric.BaseClass;
import com.AutomationProject.genric.Driver;
import com.AutomationProject.genric.Excelutills;
import com.AutomationProject.genric.Iconstant;
import com.Vtiger.HomepagePOM.HomePage;
import com.Vtiger.LeadsPOM.Create_new_leads_page;
import com.Vtiger.LeadsPOM.Leadspage;
@Listeners(com.AutomationProject.genric.ListnerClass.class)
public class CreateLeads_withValid_CredentialsTest extends BaseClass
{
	Leadspage lp;
	Create_new_leads_page cnlp;
	
	@Test
	public void  CreateLeads_withValid_Credentials1() throws Throwable
	{
		eu=new Excelutills();
		hmp= new HomePage(Driver.getDriver());
		lp=new Leadspage(Driver.getDriver());
		cnlp=new Create_new_leads_page(Driver.getDriver());
		hmp.getLeadsbtn().click();
		lp.getPlusbtn().click();
		
		cnlp.getLastnameTextbox().sendKeys(eu.singleDataFetch(Iconstant.excelpath, 1, 3,"Leads"));
		cnlp.getCompanyTextbox().sendKeys(eu.singleDataFetch(Iconstant.excelpath, 1, 4, "Leads"));
		Driver.getDriver().findElement(By.id("asjbcd")).sendKeys("4512");
		cnlp.getSavebutn().click();
		
	}
	

}
