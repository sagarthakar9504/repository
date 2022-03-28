package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators {
	public static WebDriver driver;
	
	//constructor with one parameter for all pages is required
	public LoginPageLocators(WebDriver driver) {
		this.driver=driver;
		
		
		
		
		
		
		
	}
	public WebElement getUsernametxt() {
		return driver.findElement(By.id("txtUsername"));
		
	}
	public WebElement getPasswordtxt() {
		return driver.findElement(By.id("txtPassword"));
	}
	public WebElement getLoginbtn() {
		return driver.findElement(By.id("btnLogin"));
	}
	public WebElement getInvalidmassagelable() {
		return driver.findElement(By.id("spanMessage"));
	}
	public  WebElement getinvalidMessageLabel() {
		return driver.findElement(By.xpath("//span[@id='spanMessage']"));
	}
	public WebElement getDashboardlable() {
		return driver.findElement(By.xpath("//h1[text()='Dashboard']"));
	}
	public  void Login(String Username,String Password) {
		getUsernametxt().sendKeys(Username);
		getPasswordtxt().sendKeys(Password);
		getLoginbtn().click();
	}

}
