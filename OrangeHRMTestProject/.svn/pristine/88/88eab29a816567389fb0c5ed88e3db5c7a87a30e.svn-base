package orangehrmlive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesDemo {
	static ChromeDriver chrome;

	public static void main(String[] args) throws Exception {
		System.out.println("Rajendra");
	
		FileInputStream read = new FileInputStream("E:\\JAVA\\OrangeHRMTestProject\\src\\orangehrmlive\\data.properties");
		Properties p = new Properties();
		p.load(read);
		
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	    chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
		
		chrome.findElement(By.name(p.getProperty("un"))).sendKeys("Admin");
		chrome.findElement(By.name(p.getProperty("pw"))).sendKeys("admin123");
		chrome.findElement(By.name(p.getProperty("btn"))).click();
		chrome.findElement(By.id(p.getProperty("wel"))).click();
	    chrome.findElement(By.xpath(p.getProperty("out"))).click();

	}

}
