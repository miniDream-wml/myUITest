package just.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.job.ui.util.GetDriver;
import com.job.ui.util.Page;

public class testGetDriver2 {

	@Test
	public void test01() {
		// TODO Auto-generated method stub
		WebDriver driver = GetDriver.driver;
		Page.open(driver, "专题管理");
		
	   
		System.out.println("这是第二个！");
		
	}
	
}
