package orangehrmlive;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newtourTestLogin {

	public static void main(String[] args) {
		//open the chrome browser 
				System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
				ChromeDriver chrome = new ChromeDriver();
				chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
				
				//maximize chrome
				chrome.manage().window().maximize();
				
				//Enter the URL
				chrome.get("http://newtours.demoaut.com/mercurysignon.php");
				//click on sign on
				chrome.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
				//now type Usname & Pw to Login
				chrome.findElement(By.cssSelector("input[name=userName]")).sendKeys("test1");
				chrome.findElement(By.cssSelector("input[name=password]")).sendKeys("test1");
				//chrome.findElement(By.cssSelector("input[type=image]")).click();
				chrome.findElement(By.cssSelector("input[value=Login]")).click();
				
				//Now entering flight details
				chrome.findElement(By.cssSelector("input[value=oneway]")).click();
				Select passCount = new Select(chrome.findElement(By.name("passCount")));
				passCount.selectByVisibleText("3");
				//passCount.selectByIndex(1);
				//passCount.selectByValue("4");
				Select fromPort = new Select(chrome.findElement(By.name("fromPort")));
				fromPort.selectByVisibleText("London");
				Select fromMonth = new Select(chrome.findElement(By.name("fromMonth")));
				fromMonth.selectByValue("7");
				Select fromDay = new Select(chrome.findElement(By.name("fromDay")));
				fromDay.selectByValue("3");
				Select toPort = new Select(chrome.findElement(By.name("toPort")));
				toPort.selectByValue("Zurich");
				Select toMonth = new Select(chrome.findElement(By.name("toMonth")));
				toMonth.selectByValue("9");
				Select toDay = new Select(chrome.findElement(By.name("toDay")));
				toDay.selectByValue("19");
				chrome.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
				//Select servClass = new Select(chrome.findElement(By.name("servClass")));
				//servClass.selectByValue("Business");
				//Select airline = new Select(chrome.findElement(By.name("airline")));
				//fromPort.selectByVisibleText("Blue Skies Airlines");
				chrome.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
				chrome.findElement(By.cssSelector("input[type=image]")).click();
				chrome.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")).click();
				//Select outFlight = new Select(chrome.findElement(By.name("outFlight")));
				//outFlight.selectByValue("Blue Skies Airlines$361$271$7:10");
				chrome.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")).click();
				chrome.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")).click();
				chrome.findElement(By.cssSelector("input[type=image]")).click();
				
				

	}

}
