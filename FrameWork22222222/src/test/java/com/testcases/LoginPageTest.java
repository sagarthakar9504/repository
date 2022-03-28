package com.testcases;

import org.testng.annotations.Test;

import com.commonfunctionality.Reporter;
import com.pages.LoginPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends Reporter {
	
	
	
	
		
	@Test (description="verify that user should able to login successfully with valid credentials",priority=2)
	public void TC1() {
		test=report.startTest("verify that user should able to login successfully with valid credentials");
		LoginPageLocators loginpage=new LoginPageLocators(driver);
		loginpage.Login("Admin", "admin123");
		
		if(loginpage.getDashboardlable().isDisplayed()) {
			test.log(LogStatus.PASS,"user is able to log in the application");
		}else {
			test.log(LogStatus.FAIL,"user is not able to log in the application");
		}
		
		}
		
		
	
	@Test(description="verify that user should unable to login successfully with invalid credentials",priority=1)
	public void TC2() {	
		test=report.startTest("verify that user should unable to login successfully with invalid credentials");
		LoginPageLocators login=new LoginPageLocators(driver);
		login.Login("Admin", "admin122");
		if(login.getInvalidmassagelable().isDisplayed()) {
			test.log(LogStatus.PASS, "user is not able to log in the application   :"+login.getInvalidmassagelable().getText());
		}else {
			test.log(LogStatus.FAIL, "user is able to log in");
		}
	
	}
	

	

}
