package orangehrmlive;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsTest {
	static ChromeDriver chrome;

	public static void main(String[] args) throws Exception {
		//class:Robot:java.awt.package
		//access your keyboard of your system
		//press n release 
		//keys:Control n 't'
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		//chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
		chrome.navigate().to("http://www.londonfreelance.org/courses/frames/index.html");
		chrome.switchTo().frame("navbar");
		
		Thread.sleep(2000);
		chrome.findElement(By.linkText("Sample content")).click();
		Thread.sleep(2000);
		chrome.switchTo().defaultContent();
        /** Robot openTab = new Robot();
		
		openTab.keyPress(KeyEvent.VK_CONTROL);chrome.navigate().to("https://opensource-demo.orangehrmlive.com/");
		openTab.keyPress(KeyEvent.VK_T);
		openTab.keyRelease(KeyEvent.VK_CONTROL);
		openTab.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		List<String> l = new ArrayList(chrome.getWindowHandles());//return no of tabs
		chrome.switchTo().window(l.get(2));
		
		
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.name("Submit")).click();
		Thread.sleep(2000);*/

	}

}
