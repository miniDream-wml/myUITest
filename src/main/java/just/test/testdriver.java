package just.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testdriver {

	@Test
	public  void td() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/users/wangmenglei/software/chromedriver");//chromedriver服务地址
		
        WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
        driver.get("http://www.baidu.com");//打开指定的网站
        
        driver.quit();
	}

}
