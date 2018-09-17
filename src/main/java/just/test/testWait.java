package just.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.job.ui.util.PropertiesHandle;

public class testWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", PropertiesHandle.readValue("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");        
        
      //--------------------自定义判断条件-----------------------------
         WebDriverWait wait = new WebDriverWait(driver, 3);
         Boolean element1 = wait.until(new ExpectedCondition<Boolean>() {
              public Boolean apply(WebDriver driver) {
                  return driver.findElement(By.xpath("//*[@id='kw']")).getAttribute("class").contains("s_ipt");
                              }
                  });		

        WebElement bb = driver.findElement(By.xpath("//*[@id='kw']"));
        bb.sendKeys("hello");
        
    }

}