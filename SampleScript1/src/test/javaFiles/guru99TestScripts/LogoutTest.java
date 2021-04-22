package guru99TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import guru99PageObjects.LoginGuru99;
import guru99PageObjects.LogoutGuru99;
import resources.Base;

public class LogoutTest extends Base {
public WebDriver driver;
	
	
	@BeforeTest()
	public void initialize() throws IOException {
		 driver=initializeDriver();
	}
	
	@Test()
	public void logoutTestCase() throws IOException, InterruptedException {
		
		launchApplication();
		
		LoginGuru99 loginGuru=new LoginGuru99(driver);
		loginGuru.enterUserName(properties()[0]).enterPassword(properties()[1]).clkLogin();
		
		LogoutGuru99 logoutGuru=new LogoutGuru99(driver);
		logoutGuru.clkLogout();
	}
}
