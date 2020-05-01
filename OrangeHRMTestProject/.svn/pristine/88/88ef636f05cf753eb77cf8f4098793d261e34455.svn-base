package orangehrmlive;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemoT {
	static ChromeDriver chrome;
  @Test (priority=1) 
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
  @Test(priority=2)
  public void LoginTest()
  {
  	  System.out.println("Passing Credentials");
  	//Now putting the credentialsin the feilds
  		chrome.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
  		chrome.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("Admin123");//given wrong input to check logout function working or not
  		chrome.findElement(By.cssSelector("input#btnLogin")).click();
  		logout();
  }
 // @Test(priority=3)
  public void logout() 
  {
  	  System.out.println("Loging out");
  	  chrome.findElement(By.id("welcome")).click();
  	   //click on logout
  		chrome.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
  }

}
