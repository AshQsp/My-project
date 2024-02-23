package com.Vtiger.LeadsTestCases;

import org.testng.annotations.Test;

import com.AutomationProject.genric.BaseClass;
import com.AutomationProject.genric.Driver;
import com.AutomationProject.genric.WebDriverUtils;
import com.Vtiger.HomepagePOM.HomePage;
import com.Vtiger.LeadsPOM.Clickoneditbtn;
import com.Vtiger.LeadsPOM.Clickonnamefored;
import com.Vtiger.LeadsPOM.Editpageandsavebtn;

public class EditleadsTest extends BaseClass 
{
	Clickonnamefored cne;
	Clickoneditbtn ceb;
	Editpageandsavebtn es;
	@Test
	public void editleads()
	{
		hmp=new HomePage(Driver.getDriver());
		wdu=new WebDriverUtils();
		cne=new Clickonnamefored(Driver.getDriver());
		ceb=new Clickoneditbtn(Driver.getDriver());
		es=new Editpageandsavebtn(Driver.getDriver());
		hmp.getLeadsbtn().click();
		cne.getClicknameedit().click();
		ceb.getClickonedit().click();
		es.getFirstnameboxineditpage().sendKeys("rocky");
		es.getClickonsavebtnineditpage().click();
		
	}

}
