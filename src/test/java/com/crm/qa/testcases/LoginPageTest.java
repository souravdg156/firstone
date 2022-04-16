package com.crm.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	public static LoginPage loginpage;
	public static HomePage homepage;
	
	
	public LoginPageTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void SetUp()
	
	
	{
		
		initialization();
		loginpage = new LoginPage();
				
	}
	
	
	@Test(priority = 2)
	public void LoginPageTitleTest()
	{
		String title = loginpage.validateLoginPageTitle();
		System.out.println(title);
	}
	
	
	@Test(priority = 1)
	public void logintoPage()
	{
		loginpage.login("sourav","password");
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.close();
		driver.quit();
	}

}
