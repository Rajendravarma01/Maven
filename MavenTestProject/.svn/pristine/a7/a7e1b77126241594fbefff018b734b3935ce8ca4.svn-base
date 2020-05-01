package storeOrangeHRMTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RunHRMTest {
	static ChromeDriver chrome;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		    chrome = new ChromeDriver();
			chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			chrome.manage().window().maximize(); //maximize chrome
			chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
	    
	}

	@Given("login page is visited")
	public void login_page_is_visited() {
		chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
	    
	}

	@When("I enter the credentials")
	public void i_enter_the_credentials() throws Exception {
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
	    
	}

	@Then("user should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
		System.out.println("User successfully logged in");
		
	   
	}
	@When("I click on Admin")
	public void i_click_on_Admin() {
		chrome.findElement(By.linkText("Admin")).click();
		System.out.println("Admin here");
	    
	}

	@Then("optios under should be displayed")
	public void optios_under_should_be_displayed() {
		System.out.println("Options are Present");
		
	    
	}

}
