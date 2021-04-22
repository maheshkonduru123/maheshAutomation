package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositMoneyGuru99 {
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='DepositInput.php']")
	WebElement depositBtn;

	@FindBy(xpath = "//input[@name='accountno']")
	WebElement accountNoTxt;

	@FindBy(xpath = "//input[@name='ammount']")
	WebElement ammountTxt;

	@FindBy(xpath = "//input[@name='desc']")
	WebElement descriptionTxt;

	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submitBtn;

	public DepositMoneyGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public DepositMoneyGuru99 clkDeposit() {
		depositBtn.click();
		return this;
	}

	public DepositMoneyGuru99 enterAccountNo(String strAccountNo) {
		accountNoTxt.sendKeys(strAccountNo);
		return this;

	}

	public DepositMoneyGuru99 enterAmmount(String strAmmount) {
		ammountTxt.sendKeys(strAmmount);
		return this;

	}

	public DepositMoneyGuru99 enterDescription(String strDescription) {
		descriptionTxt.sendKeys(strDescription);
		return this;

	}

	public DepositMoneyGuru99 clkSubmit() {
		submitBtn.click();
		return this;

	}
}
