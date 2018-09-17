package com.job.ui.contentmanager;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.job.ui.util.DriverInit;
import com.job.ui.util.GetDriver;
import com.job.ui.util.Login;
import com.job.ui.util.Page;

public class CreateNormalArticles {
	
	WebDriver driver = GetDriver.driver;
	@BeforeClass
	 public void setup() throws InterruptedException{
		/*---已经在SuiteConfig中完成，单独运行---
	    driver = DriverInit.initDriver();	    
	    Login.login(driver); 
	    */
  	    Page.open(driver, "文章管理");
  	    System.out.println("新建普通文章测试开始！");
	    
	 }
	
	@AfterClass
	public void setdown() {
		System.out.println("新建普通文章测试结束！");
	}
	    
    @Test
    public void TestArtical1 () throws InterruptedException {
   	 
    new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[1]/button[1]")));
   	 driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[1]/button[1]")).click();//进入新建页面
   	
   	 //选择链接文章
   	// driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[1]/div/div/label[3]/span[1]")).click();
   	    	 
   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");//设置日期格式
   	 System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    	
   	 //填写文章内容
  
   	new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"editorContent\"]/p")));	 
   	 WebElement nAtitle = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[2]/div/span[1]/input"));
   	 nAtitle.sendKeys("普通文章"+df.format(new Date()));
   	 
   	 WebElement nAsourse = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[3]/div/span[1]/input"));
   	 nAsourse.sendKeys("本地头条");
   	 
   	 WebElement nAlink = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[4]/div/span/input"));
   	 nAlink.sendKeys("https://www.baidu.com/");
   	 
   	 WebElement nAdetail = driver.findElement(By.xpath("//*[@id=\"editorContent\"]"));
  	 nAdetail.sendKeys("正文");
   	 
   	
   	 
   	 WebElement nAsave = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[2]/button[2]"));
   	 nAsave.click();   	 	 
    }
    @Test(enabled=false)
    public void TestArtical2 () throws InterruptedException {
   	 
   	 Thread.sleep(2000);
   	 driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[1]/button[1]")).click();
   	
   	 //选择链接文章
   	 driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[1]/div/div/label[3]/span[1]")).click();
   	 
   	 //获取当前时间
   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");//设置日期格式
   	 System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    	
   	 //填写文章内容
   	 Thread.sleep(2000);	 
   	 WebElement nAtitle = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[2]/div/span[1]/input"));
   	 nAtitle.sendKeys("链接文章"+df.format(new Date()));
   	 
   	 WebElement nAsourse = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[3]/div/span[1]/input"));
   	 nAsourse.sendKeys("本地头条");
   	 
   	 WebElement nAlink = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[4]/div/span/input"));
   	 nAlink.sendKeys("http://erwerwegrfgfg.cn/s/MTU1MA");
   	 Thread.sleep(2000);
   	 nAsourse.click();
   	 
   	 WebElement nAsave = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[2]/button[2]"));
   	 nAsave.click();
   	 	 
    }
    @Test(enabled=false)
    public void TestArtical3 () throws InterruptedException {
   	 
   	 Thread.sleep(2000);
   	 driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[1]/button[1]")).click();
   	
   	 //选择组图文章
   	 driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[1]/div/div/label[2]/span[1]")).click();
   	 
   	 //获取当前时间
   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");//设置日期格式
   	 System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    	
   	 //填写文章内容
   	 Thread.sleep(2000);	 
   	 WebElement nAtitle = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[2]/div/span[1]/input"));
   	 nAtitle.sendKeys("组图文章"+df.format(new Date()));
   	 
   	 WebElement nAsourse = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[3]/div/span[1]/input"));
   	 nAsourse.sendKeys("本地头条");
   	 
   	 //添加组图
   	 WebElement nAimgbtn1 = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[6]/div"));
   	 nAimgbtn1.click();
   	 
   	 WebElement nAimg1 = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[6]/div/div/div[1]/div[1]/span/input"));
   	 nAimg1.sendKeys("/Users/wangmenglei/eclipse-workspace/testpic/xwz1.jpg");
   	 
   	 WebElement nAtext1 = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[6]/div/div/div[1]/div[2]/span[1]/textarea"));
   	 nAtext1.sendKeys("顺通转交了本扬总书记致习近平总书记的贺信并转达口信。本扬在口信中表示，我代表老挝党对中共十九大取得辉煌成就，习近平总书记同志再次当选中共中央总书记表示热烈祝贺。习近平总书记以丰富的政治阅历和高超的领导艺术，带领中国党、政府和兄弟的中国人民在各项事业发展中取得了历史性成就，得到了全党的高度信任和拥戴。我们坚信，在中共十九大正确路线指引下，以习近平同志为核心的新一届中共中央领导集体，将继续带领兄弟的中国人民在中国特色社会主义现代化征程中夺取新的全面巨大胜利，实现中国共产党的宏伟蓝图和历史使命。老方高度评价习近平总书记对老中关系的高度重视和亲自指导，我愿与您一道努力，把老中关系不断推进到新高度。");
   	 
   	 WebElement nAimgbtn2 = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[6]/div/div/div[2]"));
   	 nAimgbtn2.click();
   	 
   	 WebElement nAimg2 = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[6]/div/div/div[2]/div[1]/span/input"));
   	 nAimg2.sendKeys("/Users/wangmenglei/eclipse-workspace/testpic/xwz2.jpg");
   	 
   	 WebElement nAtext2 = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[6]/div/div/div[2]/div[2]/span[1]/textarea"));
   	 nAtext2.sendKeys("1!@#$%^&*()_+-=《》<>/?,.;'；‘][qwqeryetyfsggfjhgkioiuljmxcbvxnbvnfgdsfdsfeweew`~");
 	
   	 Thread.sleep(2000);
   	 
   	 WebElement nAsave = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[2]/button[2]"));
   	 nAsave.click();
   	 	 
    }
  @Test(enabled=false)
  public void TestArtical4 () throws InterruptedException {
 	 
 	 Thread.sleep(2000);
 	 driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/div/div[1]/button[1]")).click();
 	
 	 //选择视频文章
 	 driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[1]/div/div/label[4]/span[1]")).click();
 	 
 	 //获取当前时间
 	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");//设置日期格式
 	 System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
  	
 	 //填写文章内容
 	 Thread.sleep(2000);	 
 	 WebElement nAtitle = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[2]/div/span[1]/input"));
 	 nAtitle.sendKeys("视频文章"+df.format(new Date()));
 	 
 	 WebElement nAsourse = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[3]/div/span[1]/input"));
 	 nAsourse.sendKeys("本地头条");
 	 
 	 WebElement nAlink = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[7]/div/div/span/input"));
 	 nAlink.sendKeys("https://v.qq.com/x/page/v0783a0ziqf.html");
 	 
 	 WebElement nAlinkbtn = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[1]/div/div[7]/div/div/button"));
	 nAlinkbtn.click();
 	
 	 Thread.sleep(4000);
 	 
 	 WebElement nAsave = driver.findElement(By.xpath("//*[@id=\"maple\"]/section/section/div[2]/section/div[2]/button[2]"));
 	 nAsave.click();
 	 	 
  }
}
