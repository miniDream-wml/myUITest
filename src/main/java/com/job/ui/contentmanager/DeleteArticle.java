package com.job.ui.contentmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.job.ui.util.DriverInit;
import com.job.ui.util.Login;
import com.job.ui.util.Page;
import com.job.ui.util.newsVisible;

/**
 * @author wangmenglei
 *2018/09/13
 */

public class DeleteArticle {
	
static WebDriver driver;
	
	@BeforeClass
	 public void setup() throws InterruptedException{
	    driver = DriverInit.initDriver();	    
	    Login.login(driver); 
  	    Page.open(driver, "文章管理");    
	 }
	
	@AfterClass
	public void setdown() {
		driver.quit();
		System.out.println("删除文章测试结束！");
	}
	
	@Test
	public void delete_article() {
		newsVisible.do_invisible(driver);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		try {
	        wait.until(new ExpectedCondition<Boolean>() {
	             public Boolean apply(WebDriver driver) {
	                 return !driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[2]/ul/li[2]/span[9]/span[3]/a")).getAttribute("class").contains("disabled");
	                             }
	                 });	
		} catch(Exception e) {
			System.out.println("删除按钮不可见！");
		}

       WebElement delBtn = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[2]/ul/li[2]/span[9]/span[3]/a"));
       delBtn.click();//点击删除
       
       try {
    	   wait.until(new ExpectedCondition<Boolean>() {
               public Boolean apply(WebDriver driver) {
                   return driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[2]/div[2]/div")).getAttribute("class").contains("active");
                               }
                   });

           driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[2]/div[2]/div/section/footer/button[1]")).click();//确定删除
       } catch (Exception e) {
           System.out.println("删除确认框不可见！");
       }
	}
	
}
