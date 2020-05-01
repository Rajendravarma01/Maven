package pomTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class zeroLoginTest {
	static ChromeDriver chrome;

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	    chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); 
		chrome.get("http://zero.webappsecurity.com");
		
		
		storePageObjects objects = PageFactory.initElements(chrome, storePageObjects.class);
		objects.loginTest();
		
    
	}

}
