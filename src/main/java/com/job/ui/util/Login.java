package com.job.ui.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.job.ui.util.DriverInit;
import com.job.ui.util.Login;
import com.job.ui.util.PropertiesHandle;

public class Login {
	
	public static void login(WebDriver driver) throws InterruptedException {		
		//打开测试后台页面
		driver.get(PropertiesHandle.readValue("baseUrl"));
        //System.out.println("当前打开页面的标题是： " + driver.getTitle());
		new WebDriverWait(driver,1).until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("input"))));
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        //System.out.println(inputs.size());
        inputs.get(0).clear();
        //输入用户名
        inputs.get(0).sendKeys(PropertiesHandle.readValue("username"));
        inputs.get(1).clear();
        //输入密码
        inputs.get(1).sendKeys(PropertiesHandle.readValue("password"));
        //登录，这边用click()函数有问题，用按回车的方式
        driver.findElements(By.tagName("button")).get(0).sendKeys("\n");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverInit.initDriver();
		Login.login(driver);
	}
}
