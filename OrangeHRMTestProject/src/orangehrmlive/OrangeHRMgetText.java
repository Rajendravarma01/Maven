package orangehrmlive;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMgetText {

	public static void main(String[] args) {
		//open the chrome browser 
				System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
				ChromeDriver chrome = new ChromeDriver();
				chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
				
				//maximize chrome
				chrome.manage().window().maximize();
				
				//Enter the URL
				chrome.get("https://opensource-demo.orangehrmlive.com/");
				//String loginTxtE = "Login Panel";   for checking given wrong input
				String loginTxtE = "LOGIN Panel";  //actual input
				String loginTxtA = chrome.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
				System.out.println("Actual text :" + loginTxtA);
				//1st check poit
				if(loginTxtE.equals(loginTxtA))
				{
					System.out.println("page successfully laoded");
				  String btnTxtA = chrome.findElement(By.name("Submit")).getAttribute("value");
				  System.out.println("Actual text :" + btnTxtA);
				  WebElement loginBtn = chrome.findElement(By.name("Submit"));
					//check loginbtn is labeled
					//boolean btnIsVisible = chrome.findElement(By.name("Submit")).isDisplayed();
					boolean btnIsVisible = loginBtn.isDisplayed();
				  if(btnIsVisible==true)
						  System.out.println("Text matches");
						  else
							  System.out.println("Text not matches");
				}
				else
					System.out.println("Error");
						  
						  				 			
	}

}
