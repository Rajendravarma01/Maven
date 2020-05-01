package zeroObjectTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="user_login")
	WebElement uname;
	
	
	@FindBy(id="user_password")
	WebElement passwd;
	
	@FindBy(id="user_remember_me")
	WebElement remember_me;
	
	@FindBy(name="submit")
	WebElement signIn;
	
}
