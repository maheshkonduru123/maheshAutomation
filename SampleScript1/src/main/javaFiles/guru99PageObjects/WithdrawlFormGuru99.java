package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithdrawlFormGuru99 {

	public WebDriver driver;

	public WithdrawlFormGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@href='WithdrawalInput.php']")
	WebElement withdrawlFormBtn;

	@FindBy(xpath = "//*[@name='accountno']")
	WebElement accountNoTxt;

	@FindBy(xpath = "//*[@name='ammount']")
	WebElement amountTxt;

	@FindBy(xpath = "//*[@name='desc']")
	WebElement descriptionTxt;

	@FindBy(xpath = "//*[@name='AccSubmit']")
	WebElement accSubmitBtn;

	public WithdrawlFormGuru99 clkWithdrawlForm() {
		withdrawlFormBtn.click();
		return this;
	}

	public WithdrawlFormGuru99 enterAccountNo(String strAccountNo) {
		accountNoTxt.sendKeys(strAccountNo);
		return this;
	}

	public WithdrawlFormGuru99 enterAmount(String strAmount) {
		amountTxt.sendKeys(strAmount);
		return this;
	}

	public WithdrawlFormGuru99 enterDescription(String strDescription) {
			descriptionTxt.sendKeys(strDescription);
			return this;
			
	}
	public WithdrawlFormGuru99 clkAccSubmit() {
		accSubmitBtn.click();;
		return this;
}
}
