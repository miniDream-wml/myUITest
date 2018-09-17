package com.job.ui.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author wangmenglei
 *2018/09/13
 */

public class newsVisible {

	public static void do_visible(WebDriver driver) {
		WebElement visBtn = 
			(new WebDriverWait(driver, 3)).until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver){
					return driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[2]/ul/li[2]/span[8]/span"));
			}
		});
		if (!visBtn.getAttribute("class").contains("checked"))//不可见
			visBtn.click();//置为可见
	}
	
	public static void do_invisible(WebDriver driver) {
		WebElement visBtn = 
			(new WebDriverWait(driver, 3)).until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver){
					return driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[2]/ul/li[2]/span[8]/span"));
			}
		});
		if (visBtn.getAttribute("class").contains("checked"))//可见
			visBtn.click();//置为不可见
	}
	
	
}
