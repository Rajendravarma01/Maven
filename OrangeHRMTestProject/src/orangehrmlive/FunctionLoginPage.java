package orangehrmlive;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionLoginPage {
	static ChromeDriver chrome;
	void WebPage()
	{
		//open the chrome browser 
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	    chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
		
	}
	void loginTest()
	{
		//Now putting the credentialsin the feilds
				chrome.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
				chrome.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("admin123");
				chrome.findElement(By.cssSelector("input#btnLogin")).click();		
	}
	void chckDashboard()
	{
		boolean checkDashboard = chrome.findElement(By.xpath("//*[@id=\"MP_link\"]")).isDisplayed();
		if(checkDashboard==true)
		{
			System.out.println("successfully loaded Dashboard");
				chrome.findElement(By.id("welcome")).click();
				//click on logout
				chrome.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		}		
	}
	void LoginPageDisplayed()
	{
		String loginTxtE = "LOGIN Panel";  //actual input
		String loginTxtA = chrome.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
		System.out.println("Actual text :" + loginTxtA);
		if(loginTxtE.equals(loginTxtA))
		{
			System.out.println("Login Page successfully loaded");
		    //String btnTxtA = chrome.findElement(By.name("Submit")).getAttribute("value");
			String btnTxtA = chrome.getTitle();
		    System.out.println("Actual text :" + btnTxtA);
		     WebElement loginBtn = chrome.findElement(By.name("Submit"));
		     boolean btnIsVisible = loginBtn.isDisplayed();
		  if(btnIsVisible==true)
			  
				  System.out.println("Text matches");
				 // return btnIsVisible;
				  else
					  System.out.println("Text not matches");
		}
		else
			System.out.println("Error");
	}
	void closeBrowser()
	{
		/**int x=btnIsVisible;
		if(x==1)
		{
			getDriver.close();
			System.out.println("Close Browser");
		}*/
		chrome.close();
			
	}

	public static void main(String[] args) {
		FunctionLoginPage obj= new FunctionLoginPage();
		obj.WebPage();
		obj.loginTest();
		obj.chckDashboard();
		obj.LoginPageDisplayed();
		obj.closeBrowser();

	}

}
