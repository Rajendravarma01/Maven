package TestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MvnTestNGLoginTest {
	static ChromeDriver chrome;
	@BeforeMethod
  //@Test (priority=1) 
  public void openBrowser()
  {
		System.out.println("In Beforemethod");
	  System.out.println("Opening Browser");
		//open the chrome browser 
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
  }
	@Test
  //@Test(priority=2)
  public void LoginTest()
  {
  	  System.out.println("Passing Credentials");
  	//Now putting the credentialsin the feilds
  	chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
	chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
	chrome.findElement(By.name("Submit")).click();
	System.out.println("Login successful");
  }
  @AfterMethod
 // @Test(priority=3)
  public void logout() 
  {
  	  System.out.println("Loging out");
  	  chrome.findElement(By.id("welcome")).click();
  	   //click on logout
  		chrome.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
  		System.out.println("In afterMethod");
  		chrome.quit();
  		
  }

}

