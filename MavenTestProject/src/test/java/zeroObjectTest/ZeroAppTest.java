package zeroObjectTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ZeroAppTest {
   
	static WebDriver chrome;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	    chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("http://zero.webappsecurity.com/login.html");
		
		LoginPage login=PageFactory.initElements(chrome, LoginPage.class);
		login.uname.sendKeys("username");
		login.passwd.sendKeys("password");
		login.remember_me.click();
		login.signIn.click();
		//click on account summery
		 AcoountSummaryPage accSum=PageFactory.initElements(chrome, AcoountSummaryPage.class);
		 accSum.accActivity.click();
		 
		//click on show account 
		 TransferPage funds = PageFactory.initElements(chrome, TransferPage.class);
		 funds.TransferAct.click();
		 WebElement element = chrome.findElement(By.xpath("//*[@id=\"tf_fromAccountId\"]"));
		 Select select = new Select(element);
		 List<WebElement> list = select.getOptions();
		 for(int i=0; i<list.size(); i++)        
		     {
		         System.out.println(list.get(i).getText());
		     }
	  Select fromAccountId = new Select(chrome.findElement(By.name("fromAccountId")));
	  fromAccountId.selectByValue("2");
	  Select toAccountId = new Select(chrome.findElement(By.name("toAccountId")));
	  toAccountId.selectByValue("4");
	  chrome.findElement(By.name("amount")).sendKeys("68");
	  chrome.findElement(By.name("description")).sendKeys("EMI");
	  chrome.findElement(By.id("btn_submit")).click();//continue
	  chrome.findElement(By.id("btn_submit")).click();
	  
	  String TransuccessA = "You successfully submitted your transaction.";
	  String TransuccessE = chrome.findElement(By.xpath("//*[@id=\"transfer_funds_content\"]/div/div/div[1]")).getText();
	  Assert.assertEquals(TransuccessA,TransuccessE); // compared actual and expedted data
	  System.out.println("Your Amount Transfered Successfully!!");
	  
	  //Logout
	  LogoutTest out = PageFactory.initElements(chrome, LogoutTest.class);
		 out.click.click();
		 out.Logout.click();
	     

		
	
		
		
	}
}

