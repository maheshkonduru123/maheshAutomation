package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountGuru99 {
	public WebDriver driver;

	public EditAccountGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@href='editAccount.php']")
	WebElement editAccountBtn;

	@FindBy(xpath = "//*[@name='accountno']")
	WebElement accountNoTxt;

	@FindBy(xpath = "//*[@name='AccSubmit']")
	WebElement submitBtn;

	
	public EditAccountGuru99 clkEditAccount() {
		editAccountBtn.click();
		return this;
	}

	public EditAccountGuru99 enterAccountNo(String strAccountNo) {
		accountNoTxt.sendKeys(strAccountNo);
		return this;
	}
	
	public EditAccountGuru99 clkSubmit() {
		submitBtn.click();
		return this;
	}
}
