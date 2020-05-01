package orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
static ChromeDriver chrome;
// @Test//(priority=1)   //annotation
@BeforeTest //annotation  
  public void openBrowser() 
  {
	  System.out.println("Opening Browser");
	//open the chrome browser 
			System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		    chrome = new ChromeDriver();
			chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			chrome.manage().window().maximize(); //maximize chrome
			chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
  }
  
//  @Test//(priority=2)   //annotation
/**@BeforeTest   //annotation
  public void enterUrl() 
  {
	  System.out.println("This is Test2:Entering Url");
	  chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
  }*/
  
  @Test//(priority=3)   //annotation
  public void LoginTest()
  {
	  System.out.println("This is Test3:Passing Credentials");
	//Now putting the credentialsin the feilds
		chrome.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
		chrome.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("admin123");
		chrome.findElement(By.cssSelector("input#btnLogin")).click();
  }
  @Test
  public void logout() 
  {
	  System.out.println("This is Test4:Loging out");
	  chrome.findElement(By.id("welcome")).click();
	   //click on logout
		chrome.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
  }
  
 // @Test//(priority=4)   //annotation
  @AfterTest  //annotation
  public void closeBrwoser() 
  {
	  /**System.out.println("This is Test4:Loging out");
	  chrome.findElement(By.id("welcome")).click();
	   //click on logout
		chrome.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();*/
		chrome.close();
		
	  
  }
}
