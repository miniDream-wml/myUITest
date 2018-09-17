package just.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.job.ui.util.DriverInit;
import com.job.ui.util.Login;
import com.job.ui.util.Page;

/**
 * @author wangmenglei
 *
 */

public class testwebdriverWait {

static WebDriver driver;
	
	@BeforeClass
	 public void setup() throws InterruptedException{
	    driver = DriverInit.initDriver();	    
	    Thread.sleep(4000);  
	    Login.login(driver);
	    Thread.sleep(4000);  
  	    Page.open(driver, "图片视频银行");
	    
	 }
	
	@AfterClass
	public void setdown() {
		driver.quit();
		System.out.println("图片视频测试结束！");
	}
	
	@Test
	public void TestArtical1 () throws InterruptedException {
   	 
	 new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='bank-container']/div[1]/div[1]/div/div[1]/div/div[3]")));
   	 driver.findElement(By.xpath("//*[@id=\"bank-container\"]/div[1]/div[1]/div/div[1]/div/div[3]")).click();
/* ----------显式等待------  	
   	 new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[2]/ul/li[1]/div/img")));
   	 WebElement nAdetail = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/ul/li[1]/div/span[1]"));
   	 Actions builder = new Actions(driver);
     Actions hoverOverRegistrar = builder.moveToElement(nAdetail);
     hoverOverRegistrar.perform();
*/ 
   	 
     //--------------------自定义判断条件-----------------------------
      WebDriverWait wait = new WebDriverWait(driver, 5);
      WebElement btn = wait.until(new ExpectedCondition<WebElement>() {
		public WebElement apply(WebDriver driver) {
               return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div"));
                           }
               });
      btn.click();

      
      WebDriverWait wait2 = new WebDriverWait(driver, 3);
      Boolean element1 = wait2.until(new ExpectedCondition<Boolean>() {
           public Boolean apply(WebDriver driver) {
               return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div")).getAttribute("class").contains("upload");
                           }
               });
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div")).click();
      
      
      
      
      
      
      
//   	 

//-					     WebElement elementId = (new WebDriverWait(driver, 10)).until(
//					    		 new ExpectedCondition(){
//										public WebElement apply(WebDriver d){
//											return d.findElement(By.xpath("//*[@id=\"app\"]/div[2]/ul/li[1]/div/span[1]/span[1]/i"));
//											}
//-										});
     
//     WebElement textInputBox = 
//				(new WebDriverWait(driver, 10)).until(new ExpectedCondition<WebElement>() {
//					@Override
//					public WebElement apply(WebDriver driver){
//						return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div/button"));
//					}
//		});
//		textInputBox.sendKeys("自定义显式等待1");

    
   	 	 
    }
	
}
