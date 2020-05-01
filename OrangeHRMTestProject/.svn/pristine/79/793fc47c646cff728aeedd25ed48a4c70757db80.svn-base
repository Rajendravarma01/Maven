package orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMlogintest {

	public static void main(String[] args) {
		//open the chrome browser 
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		//maximize chrome
		chrome.manage().window().maximize();
		
		//Enter the URL
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		
		//locate the username to type use sendKeys cmd
		//chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//usins cssSelector:
		
		chrome.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
		chrome.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("admin123");
		//chrome.findElement(By.cssSelector("input[type=Submit]")).click();
		//chrome.findElement(By.cssSelector("input#btnLogin")).click();
		chrome.findElementByXPath("//input[@type='submit'][@value='LOGIN']").click();
		
		
		
		
		
		
		
		
		//locating password
		//chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		//click on login
		//chrome.findElement(By.name("Submit")).click();
		
		//chrome.findElement(By.id("menu_dashboard_index")).click();
		//click on welcome
		chrome.findElement(By.id("welcome")).click();
		
		
		//click on logout
		chrome.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		

		
		

	}

}
