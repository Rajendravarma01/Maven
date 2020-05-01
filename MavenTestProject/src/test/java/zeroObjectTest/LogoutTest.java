package zeroObjectTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutTest {
	
	@FindBy(xpath="//*[@id=\"settingsBox\"]/ul/li[3]/a")
	WebElement click;
	@FindBy(linkText="Logout")
	WebElement Logout;

}
