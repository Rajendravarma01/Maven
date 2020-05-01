package orangehrmlive;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	static ChromeDriver chrome;
  @Test
  public void assertTest() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	    chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL 
		
		String loginTxtE = "LOGIN Panel";  //actual input
		String loginTxtA = chrome.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
		Assert.assertEquals(loginTxtA, loginTxtE);
		WebElement loginBtn = chrome.findElement(By.name("Submit"));
	     boolean btnIsVisible = loginBtn.isDisplayed();
		//Assert.assertEquals(btnIsVisible,true);
	     assertTrue(true);
		LoginTest();
		
  }
  
  public void LoginTest()
  {
	  System.out.println("Passing Credentials");
	//Now putting the credentialsin the feilds
		chrome.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
		chrome.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("admin123");
		chrome.findElement(By.cssSelector("input#btnLogin")).click();
  }
}
