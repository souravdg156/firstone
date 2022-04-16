package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//pagefactory of object repositiry
	
	@FindBy(xpath = "//*[@name='pass']")
	WebElement password;
	
	@FindBy(xpath = "//*[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//*[@name='login']")
	WebElement login;

	//initialize driver
	public LoginPage()
	
	{
		
		PageFactory.initElements(driver, this);
		
	}

	//initialize methods
	public String validateLoginPageTitle()
	
	{
		return driver.getTitle();
		
	}
	
	
	//after login it is going to homepage == so reyurn type is the homepage
	public HomePage login(String eml, String pwd)
	
	
	{
		email.sendKeys(eml);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}
	
}
