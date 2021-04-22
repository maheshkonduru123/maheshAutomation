package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountGuru99 {
	private static final CharSequence Customerid = null;

	public WebDriver driver;
	
	public NewAccountGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//*[@href='addAccount.php']")
	WebElement newAccountBtn;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement customerIdTxt;
	
	@FindBy(xpath="//select[@name='selaccount']")
	WebElement accountTypeTxt;
	
	@FindBy(xpath="//input[@name='inideposit']")
	WebElement initialDepositTxt;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitBtn;
	
	public NewAccountGuru99 clkNewAccount() {
		newAccountBtn.click();
		return this;
	}
	
	public NewAccountGuru99 enterCustomerId(String strCustomerId) {
		customerIdTxt.sendKeys(strCustomerId);
		return this;
	}

	public NewAccountGuru99 enterAccountType(String Accounttype) {
		accountTypeTxt.sendKeys(Accounttype);
		return this;
	}
	
	public NewAccountGuru99 enterInitialDeposit(String strInitialdeposit) {
		initialDepositTxt.sendKeys(strInitialdeposit);
		return this;
	}
	
	public NewAccountGuru99 clkSubmitBtn() {
		submitBtn.click();
		return this;
	}
	
	
	
	
	

}
