package com.job.ui.contentmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.job.ui.util.DriverInit;
import com.job.ui.util.GetDriver;
import com.job.ui.util.Login;
import com.job.ui.util.Page;

/**
 * @author wangmenglei
 *2018/09/13
 */

public class IsVisible {
	
	WebDriver driver = GetDriver.driver;

	@BeforeClass
	 public void setup() throws InterruptedException{
 	    Page.open(driver, "文章管理");    
	 }
	
	@Test
	public void test01() {
		WebElement visBtn = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[2]/ul/li[2]/span[8]/span"));
		WebElement textInputBox = 
			(new WebDriverWait(driver, 3)).until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver){
					return driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[2]/ul/li[2]/span[8]/span"));
			}
		});
		textInputBox.click();
	}
	
}
