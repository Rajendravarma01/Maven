package orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parawithXMLfile{
	static ChromeDriver chrome;
	@Parameters({"un"})
  @Test (priority = 1)
  public void paraTest(String uname) 
  {
		System.out.println("In ParaTest");
	  System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	    chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL   
		
		chrome.findElement(By.name(uname)).sendKeys("Admin");
		//chrome.findElement(By.name(pass)).sendKeys("admin123");
		//chrome.findElement(By.name(sub)).click();
  }
	
   @Parameters({"pw","btn"})
 @Test (priority = 2)
 public void passTest(String pass,String sub)
	{
	   System.out.println("In PassTest");
		chrome.findElement(By.name(pass)).sendKeys("admin123");
		chrome.findElement(By.name(sub)).click();
	}
	
  @Parameters({"In","out"})
 @Test (priority = 3)
 public void logoutTest(String wel,String logout)
	{
	  System.out.println("In logoutTest");
	    chrome.findElement(By.id(wel)).click();
	    chrome.findElement(By.xpath(logout)).click();
		
	}
	
}
