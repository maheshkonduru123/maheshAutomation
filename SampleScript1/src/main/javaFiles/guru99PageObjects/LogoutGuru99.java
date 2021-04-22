package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.commFunctions;

public class LogoutGuru99 {
	public WebDriver driver;
	commFunctions cf=new commFunctions(driver);
	
	@FindBy(xpath="//*[@href='Logout.php']")
	WebElement logoutLnk;
	
	public LogoutGuru99(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clkLogout() throws InterruptedException {
		cf.scrollDown(driver);
		Thread.sleep(4000);
		cf.scrollUp(driver);
		Thread.sleep(4000);
		logoutLnk.click();
		cf.isPresentAlertForOk(driver);
	}
}
