package orangehrmlive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ZeroTestNG {
	static ChromeDriver chrome;
  @BeforeTest
  public void ZeroPageTest()
  {
		
	  //Open browser and providing login credentials and verification
	  System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
	    chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		chrome.manage().window().maximize(); //maximize chrome
		chrome.get("http://zero.webappsecurity.com/");   //Enter URL
		chrome.findElement(By.id("signin_button")).click();  //click on signIn Button
		
  }	
  @Test (priority = 1)
  public void Login_Valid() throws Exception
  {
	  
	//Reading file zero_data.propreties using below commands
	  FileInputStream read = new FileInputStream("E:\\JAVA\\OrangeHRMTestProject\\src\\orangehrmlive\\zero_data.properties");
	  Properties p = new Properties();
	  p.load(read);
	  
		//Login Credential passing
		chrome.findElement(By.name(p.getProperty("un"))).sendKeys("username");
		chrome.findElement(By.name(p.getProperty("pw"))).sendKeys("password");
		chrome.findElement(By.name(p.getProperty("btn"))).click();
		
		//checking User logged In or Not
		WebElement logedIn = chrome.findElement(By.xpath(p.getProperty("In")));
		boolean ZeroBankDashboard =logedIn.isDisplayed();
		Assert.assertEquals(ZeroBankDashboard,true);// compared actual and expedted data
          System.out.println("User Loged In successfully With Valid Credentials");
          		
  }
  @Test (priority = 2)
  public void AccountSummry() throws Exception
  {
	  FileInputStream read = new FileInputStream("E:\\JAVA\\OrangeHRMTestProject\\src\\orangehrmlive\\zero_data.properties");
	  Properties p = new Properties();
	  p.load(read);
	  
	  String TitleTxA= "Zero - Account Summary";
	  String TitleTxE = chrome.getTitle();
	  Assert.assertEquals(TitleTxA, TitleTxE);
	  System.out.println("Account Summary Page Loaded Successfully");
	  //Cash Account Validation
	  String CashAccountA="Cash Accounts";
	  String CashAccountE= chrome.findElement(By.xpath(p.getProperty("path1"))).getText();
	  Assert.assertEquals(CashAccountA,CashAccountE);// compared actual and expedted data
      String Amount1= chrome.findElement(By.xpath(p.getProperty("Amt1"))).getText();
      System.out.println("CashAccount:"+"BAL:" + Amount1);
      
      //Investment Account Validation
      String InvestmentAccountA="Investment Accounts";
      String InvestmentAccountE= chrome.findElement(By.xpath(p.getProperty("path2"))).getText();
      Assert.assertEquals(InvestmentAccountA,InvestmentAccountE);// compared actual and expedted data
      String Amount2= chrome.findElement(By.xpath(p.getProperty("Amt2"))).getText();
      System.out.println("InvestmentAccoun:"+"BAL:" + Amount2);
      
      //Credit Accounts Validation
      String CreditAccountA="Credit Accounts";
      String CreditAccountE= chrome.findElement(By.xpath(p.getProperty("path3"))).getText();
      String Amount3= chrome.findElement(By.xpath(p.getProperty("Amt3"))).getText();
      Assert.assertEquals(CreditAccountA,CreditAccountE);// compared actual and expedted data
      System.out.println("CreditAccount:"+"BAL:" + Amount3);
      
      //Loans Accounts Validation
      String LoanAccountA="Loan Accounts";
      String LoanAccountE= chrome.findElement(By.xpath(p.getProperty("path4"))).getText();
      Assert.assertEquals(LoanAccountA,LoanAccountE);// compared actual and expedted data
      String Amount4= chrome.findElement(By.xpath(p.getProperty("Amt4"))).getText();
      System.out.println("LoanAccount:"+"BAL:" + Amount4);
      System.out.println("Account Summary Tested With Respective Balalce Amount");
	  
	  
  }
  @Test (priority = 3)
  public void AccountActivity() throws Exception
  {
	  FileInputStream read = new FileInputStream("E:\\JAVA\\OrangeHRMTestProject\\src\\orangehrmlive\\zero_data.properties");
	  Properties p = new Properties();
	  p.load(read);
	  chrome.findElement(By.xpath(p.getProperty("xp"))).click(); 
	  //Checking Account Activity Page
	  String ActivityA = "Account Activity";
	  String ActivityE = chrome.findElement(By.xpath(p.getProperty("Activity"))).getText();
	  Assert.assertEquals(ActivityA,ActivityE);// compared actual and expedted data
	  System.out.println("Account Activity Page loaded");
	  //Checking DropDown Menu for different account
	  Select accountId = new Select(chrome.findElement(By.name("accountId")));
	  accountId.selectByValue("1");
	  accountId.selectByValue("2");
	  accountId.selectByValue("3");
	  accountId.selectByValue("4");
	  accountId.selectByValue("5");
	  accountId.selectByValue("6");
	  System.out.println("All Six DropDown options Are Present");
	  
  }
  
  @Test (priority = 4)
  public void FundTransfer() throws Exception
  {
	  FileInputStream read = new FileInputStream("E:\\JAVA\\OrangeHRMTestProject\\src\\orangehrmlive\\zero_data.properties");
	  Properties p = new Properties();
	  p.load(read);
	  //Fund Transfer Activity
	  chrome.findElement(By.xpath(p.getProperty("Tranfr"))).click();
	  Select fromAccountId = new Select(chrome.findElement(By.name("fromAccountId")));
	  fromAccountId.selectByValue("1");
	  Select toAccountId = new Select(chrome.findElement(By.name("toAccountId")));
	  toAccountId.selectByValue("4");
	  chrome.findElement(By.name(p.getProperty("amt"))).sendKeys("68");
	  chrome.findElement(By.name(p.getProperty("Descrp"))).sendKeys("EMI");
	  chrome.findElement(By.id(p.getProperty("sbmt"))).click();//continue
	  chrome.findElement(By.id(p.getProperty("sbmt"))).click();//submit both are same id found in inspect same so above line copied here
	  //checking Transaction successfully completed
	  String TransuccessA = "You successfully submitted your transaction.";
	  String TransuccessE = chrome.findElement(By.xpath(p.getProperty("success"))).getText();
	  Assert.assertEquals(TransuccessA,TransuccessE); // compared actual and expedted data
	  System.out.println("Your Amount Transfered Successfully!!");
	  
	  LogoutCheck();//Logout functioned called
	  	  	  
  }
  
  public void LogoutCheck() throws Exception
  {
	  //click on username on dashboard
	  chrome.findElement(By.xpath("//*[@id='settingsBox']/ul/li[3]/a")).click(); 
	  //checking Logout option available or not
	  String logotA = "Logout";
	  String logotE = chrome.findElement(By.xpath("//*[@id=\"logout_link\"]")).getText();
	  Assert.assertEquals(logotA,logotE); // compared actual and expedted data
	  System.out.println("Yes Logout Option Present");
	  chrome.findElement(By.xpath("//*[@id=\"logout_link\"]")).click();
	  //Verifying user Logouted or not successfully
	  String verifyA ="Signin";
	  String verifyE = chrome.findElement(By.xpath("//*[@id=\"signin_button\"]")).getText();
	  Assert.assertEquals(verifyA,verifyE); // compared actual and expedted data
	  System.out.println("User Logout Successfull");  
  }
  @AfterTest
  public void CloseBrowser()
  {
	  chrome.close();
  }
}
