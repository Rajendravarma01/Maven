package orangehrmlive;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	static ChromeDriver chrome;

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		//chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
		chrome.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		WebElement admin = chrome.findElement(By.linkText("Admin"));
		//mouse and keyboard action
		Actions act = new Actions(chrome);
		act.moveToElement(admin).build().perform();
		
		act.moveToElement(chrome.findElementByLinkText("Job")).build().perform();
		
		act.click(chrome.findElementByLinkText("Job Titles")).build().perform();
		
		Robot openTab = new Robot();
		
		openTab.keyPress(KeyEvent.VK_CONTROL);
		openTab.keyPress(KeyEvent.VK_T);
		openTab.keyRelease(KeyEvent.VK_CONTROL);
		openTab.keyRelease(KeyEvent.VK_T);
		
	}

}
