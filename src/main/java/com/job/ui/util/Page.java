package com.job.ui.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

	public static void open(WebDriver driver, String pagename) {
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.className("m-aside--page__link")));
		List<WebElement> pagelist = driver.findElements(By.className("m-aside--page__link"));
		int i = 0;
		for (WebElement page : pagelist) {
			if (page.getText().equals(pagename)) {
				driver.findElement(By.linkText(pagename)).click();
				break;
			} else {
				i++;
			}
		}
		
		if (i==pagelist.size()) {
			System.out.println("没有 " + pagename + " 这个页面，请确保你输入正确的页面名字");
		}
	}
	
}
