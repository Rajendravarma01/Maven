package orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleXpathTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize();
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		
		
		/*String txt1 = chrome.findElement(By.xpath("//span[contains(text(),'Username')]")).getText();
		System.out.print(txt1);
		String txt = chrome.findElement(By.xpath("//span[text()='Username')]")).getText();
		System.out.print(txt);*/
		
		
		chrome.findElementByCssSelector("form>div>input").sendKeys("Admin");
		chrome.findElementByCssSelector("form>div>input[type=password]").sendKeys("admin123");
		//chrome.findElement(By.cssSelector("input[startswith='txtUser']")).sendKeys("Admin");
		//chrome.findElement(By.cssSelector("input[id*='txtUser']")).sendKeys("Admin");
		//chrome.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		//chrome.findElement(By.cssSelector("input[id*='txtP']")).sendKeys("admin123");
		chrome.findElement(By.cssSelector("input[type*='sub']")).click();
		//chrome.findElement(By.name("Submit")).click();
		//chrome.findElementByXPath("//input[@type='submit'][@value='LOGIN']").click();//multiple attribute
		//chrome.findElementByXPath("//input[starts-with(@id,'btn')]").click();//xpath with starts with
		//chrome.findElementByXPath("//input[contains(@class,'button')]").click();//xpath with contains method
		

	}

}
