package com.job.ui.util;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by wangemngeli on 2018/09/10.
 * initdriver
 */

public class DriverInit {
	
	static WebDriver driver;
	
	public static WebDriver initDriver() {
		
		System.setProperty("webdriver.chrome.driver", PropertiesHandle.readValue("chromedriver"));//chromedriver服务地址

		//去掉浏览器上类似“chrome正受到自动测试软件的控制”这种提示
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		//初始化一个chrome浏览器实例，实例名称叫driver
		driver = new ChromeDriver(capabilities);	
        //最大化窗口    
		//driver.manage().window().maximize();
        //设置隐性等待时间
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        return driver;
	}

}