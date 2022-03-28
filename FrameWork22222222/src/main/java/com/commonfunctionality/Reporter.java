package com.commonfunctionality;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Reporter extends BrowserLaunch {
	public static ExtentTest test;
	public static ExtentReports report;
	

	
	@BeforeSuite(alwaysRun=true)
	public  void startTest() {
		report=new ExtentReports("Result/Result.html",true);
	}

	
	@AfterSuite(alwaysRun=true)
	public  void endTest()
	{
		report.endTest(test);
	report.flush();
	}

	
}
