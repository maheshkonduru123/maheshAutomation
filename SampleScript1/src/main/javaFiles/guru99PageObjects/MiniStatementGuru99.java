package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementGuru99 {
	public WebDriver driver;
	
	public MiniStatementGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@href='MiniStatementInput.php']")
	WebElement miniStatementBtn;
	
	@FindBy(xpath="//*[@name='accountno']")
	WebElement accountNoTxt;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submitBtn;
	
	public MiniStatementGuru99 clkMinistatement() {
		miniStatementBtn.click();
		return this;
	}
	
	public MiniStatementGuru99 enterAccountNo(String strAccountNo) {
		accountNoTxt.sendKeys(strAccountNo);
		return this;
	}
	

	public MiniStatementGuru99 clkSubmit() {
		submitBtn.click();
		return this;
	

}
}