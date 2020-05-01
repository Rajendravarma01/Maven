package orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo1 {
	static ChromeDriver chrome;
  @Test
  public void AssertDependancy()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	    chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL 
		
		String loginTxtE = "LOGIN Panel";  //actual input
		String loginTxtA = chrome.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
		Assert.assertEquals(loginTxtE,loginTxtA);
  }
  @Test(dependsOnMethods="AssertDependancy")
  public void Test()
  {
    System.out.println("Dependancy executed");
  }
}
