package pomTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class storePageObjects 
{
	//Page object Model
	@FindBy(id="signin_button")
	WebElement btn;
	
	@FindBy(name="user_login")
	WebElement un;
	//Equivalent to :ch.findElement(By.name("user_login"))
	
	@FindBy(name="user_password")
	WebElement pwd;
	
	@FindBy(name="submit")
	WebElement loginBtn;
	
	public void loginTest()
	{
		btn.click();
		un.sendKeys("username");
		pwd.sendKeys("password");
		loginBtn.click();
		
	}
	

}
