package TestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingMvnLogin {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize();
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		
		//Login 
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.name("Submit")).click();
		System.out.println("Login successful");
		
		
		//Logout
		chrome.findElement(By.id("welcome")).click();
		chrome.findElement(By.linkText("Logout")).click();
		System.out.println("Logout successful");
		
		
		

	}

}
