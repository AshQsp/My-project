package com.AutomationProject.genric;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;
//reusable methods
public class Javautils
{
	public int randoNumber(int range)
	{
		Random r=new Random();
		return r.nextInt(range);
		
	}
	
	public String dateGenerate()
	{
		Date d=new Date();
		String fullData=d.toString();
		   String[] s = fullData.split(" ");
		   String date=s[2]+"-"+s[1]+"-"+s[5];
		   return date;
	}
	public String currentTimeGenerated()
	{
		Date d=new Date();
		String fulldata=d.toString();
		String[] s=fulldata.split(" ");
		String date=s[3].replace(":", "-");
		return date;
	}
	@Test
	public void m1()
	{
	   System.out.println(dateGenerate());
	   System.out.println(currentTimeGenerated());
	}
}
