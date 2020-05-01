package orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RajendraDemo {
	static ChromeDriver chrome;
  @BeforeTest
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
  @BeforeMethod
  public void LoginTest()
  {
	  System.out.println("Passing Credentials");
	//Now putting the credentialsin the feilds
		chrome.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
		chrome.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("admin123");
		chrome.findElement(By.cssSelector("input#btnLogin")).click();
  }
  @Test
  public void adminTest() 
  {
	  System.out.println("This is Admin");
		chrome.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
  }
  @Test
  public void leaveTest() 
  { 
	  chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	  System.out.println("This is LeaveTest");
		chrome.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
  }
  @AfterMethod
  public void logout() 
  {
	  chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	  System.out.println("Loging out");
	  chrome.findElement(By.id("welcome")).click();
	   //click on logout
		chrome.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
  }
 
  @AfterTest
  public void closeBrwoser() 
  {
	  chrome.close();
		 
  }
}
