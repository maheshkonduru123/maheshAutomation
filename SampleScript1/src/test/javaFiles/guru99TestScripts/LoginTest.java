package guru99TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import guru99PageObjects.LoginGuru99;
import resources.Base;

//Test NG-->Test Next Generation and open source tool.
//unit testing framework, can see reports

public class LoginTest extends Base {
	public WebDriver driver;
	
	
	@BeforeTest()
	public void initialize() throws IOException {
		 driver=initializeDriver();
	}
	
	@Test()
	public void loginTestCase() throws IOException {
		
		launchApplication();
		
		LoginGuru99 loginGuru=new LoginGuru99(driver);
		loginGuru.enterUserName(properties()[0]).enterPassword(properties()[1]).clkLogin();
	}
	
	

}
