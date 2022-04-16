package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
	 /*try {
		 
		  prop = new Properties();
		 FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\sinha\\Desktop\\project\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties"));
		 prop.load(ip);
		 
	 }
	 catch(FileNotFoundException e){
		 
		 e.printStackTrace();
		 
	 }
	 catch(IOException e){
		 
		 e.printStackTrace();
	 }
	}
	*/
	}
	public static void initialization()
	
	{
		/*
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
			
		{
			
			
		}*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinha\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMLICITWAIT, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	}
	
}
