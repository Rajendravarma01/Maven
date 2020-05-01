package orangehrmlive;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class StoreDataProvider1 {
  @Test(dataProvider = "dpTest",dataProviderClass=StoreDataProvider.class)
	  public void UsingDp(String s1, String s2) {
		  System.out.println(s1 +" "+ s2);
		  
		  System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		  ChromeDriver chrome = new ChromeDriver();
			chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			chrome.manage().window().maximize(); //maximize chrome
			chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
			
			chrome.findElement(By.name("txtUsername")).sendKeys(s1);
			chrome.findElement(By.name("txtPassword")).sendKeys(s2);
			chrome.findElement(By.name("Submit")).click();
			chrome.close();
			chrome.quit();

  }
  }

  
