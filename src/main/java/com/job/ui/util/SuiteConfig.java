package com.job.ui.util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.job.ui.util.GetDriver;
import com.job.ui.util.Login;

public class SuiteConfig {
	
	WebDriver driver = GetDriver.driver;
	@BeforeSuite
	public void beforeSuite() throws InterruptedException{
	    Login.login(driver);
		System.out.println("--登录ncms!");
	}
	
	@AfterSuite
	public void afterSuite(){
		//driver.quit();
		System.out.println("--关闭浏览器！--");
	}
}
