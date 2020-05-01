package orangehrmlive;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "dpTest")
  public void dpTest(String uname, String pass) {
	  System.out.println(uname +" "+ pass);
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	  ChromeDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
		
		chrome.findElement(By.name("txtUsername")).sendKeys(uname);
		chrome.findElement(By.name("txtPassword")).sendKeys(pass);
		chrome.findElement(By.name("Submit")).click();
		chrome.close();
		chrome.quit();

  }

  @DataProvider(name="dpTest")
  public Object[][] Credentials() {
    return new Object[][] {
      new Object[] { "xyz", "a" },
      new Object[] { "Admin", "admin123" },
    };
  }
}
