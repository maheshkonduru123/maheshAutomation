package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferGuru99 {
	public WebDriver driver;
	
	public FundTransferGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@href='FundTransInput.php']")
	WebElement fundTransferBtn;
	
	@FindBy(xpath="//input[@name='payersaccount']")
	WebElement payersaccountTxt;
	
	@FindBy(xpath="//input[@name='payeeaccount']")
	WebElement payeeaccountTxt;
	
	@FindBy(xpath="//input[@name='ammount']")
	WebElement ammountTxt;
	
	@FindBy(xpath="//input[@name='desc']")
	WebElement descriptionTxt;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement accSubmitBtn;
	
	
	public FundTransferGuru99 clkNewCustomer() {
		fundTransferBtn.click();
		return this;

	}
	
	public FundTransferGuru99 enterpayersaccount(String strpayersaccount) {
		payersaccountTxt.sendKeys(strpayersaccount);
		return this;
	}

	public FundTransferGuru99 enterpayeeaccount(String strpayeeaccount) {
		payeeaccountTxt.sendKeys(strpayeeaccount);
		return this;
	}

	
	public FundTransferGuru99 enterammount(String strammount) {
		ammountTxt.sendKeys(strammount);
		return this;
}
	public FundTransferGuru99 enterDescription(String strDescription) {
		descriptionTxt.sendKeys(strDescription);
		return this;
}
	
	public FundTransferGuru99 clkAccSubmit() {
		accSubmitBtn.click();
		return this;
}
}
