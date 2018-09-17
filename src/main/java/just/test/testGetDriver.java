package just.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.job.ui.util.GetDriver;
import com.job.ui.util.Login;
import com.job.ui.util.Page;

public class testGetDriver {

	@Test
	public void test01() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = GetDriver.driver;
		//System.out.println(driver);
		Login.login(driver);
		Page.open(driver, "文章管理");
		
	    new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[1]/button[1]")));
	   	driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[1]/button[1]")).click();//进入新建页面
	   	System.out.println("这是第一个！");
		
	}

}
