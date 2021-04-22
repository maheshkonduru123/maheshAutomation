package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginGuru99 {
	public WebDriver driver;
	//page factory methodology
		
	@FindBy(xpath="//input[@name='uid']")
	WebElement userNameTxt;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passWordTxt;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginBtn;
	
	
	public LoginGuru99(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	public LoginGuru99 enterUserName(String username) {
		userNameTxt.sendKeys(username);
		return this;
	}
	
	public LoginGuru99 enterPassword(String password) {
		passWordTxt.sendKeys(password);
		return this;
	}
	
	public void clkLogin() {
		loginBtn.click();
	}
	
	/*
	 * public void loginGuru99Application(String username, String password) {
	 * enterUserName(username); enterPassword(password); clkLogin(); }
	 */

}
