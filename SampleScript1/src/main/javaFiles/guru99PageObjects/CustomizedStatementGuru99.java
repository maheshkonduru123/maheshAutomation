package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatementGuru99 {
	public WebDriver driver;
	
	public CustomizedStatementGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href='CustomisedStatementInput.php']")
	WebElement customizedStatementBtn;
	
	@FindBy(xpath="//input[@name='accountno']")
	WebElement accountNoTxt;
	
	@FindBy(xpath="//input[@name='fdate']")
	WebElement fromDateTxt;
	
	@FindBy(xpath="//input[@name='tdate']")
	WebElement toDateTxt;
	
	@FindBy(xpath="//input[@name='amountlowerlimit']")
	WebElement amountLowerLimitTxt;
	
	@FindBy(xpath="//input[@name='numtransaction']")
	WebElement numTransactionTxt;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement accSubmitBtn;

	public CustomizedStatementGuru99 clkCustomizedStatement() {
		customizedStatementBtn.click();
		return this;
	}
	

	public CustomizedStatementGuru99 enterAccountNo(String strAccountNo) {
		accountNoTxt.sendKeys(strAccountNo);
		return this;
	}
	

	public CustomizedStatementGuru99 enterFromDate(String strFromDate) {
		fromDateTxt.sendKeys(strFromDate);
		return this;
	}
	
	
	public CustomizedStatementGuru99 enterToDate(String strToDate) {
		toDateTxt.sendKeys(strToDate);
		return this;
	}
	
	
	public CustomizedStatementGuru99 enterAmountLowerLimit(String strAmountLowerLimit) {
		amountLowerLimitTxt.sendKeys(strAmountLowerLimit);
		return this;
	}
	
	public CustomizedStatementGuru99 enterNumTransaction(String strNumTransaction) {
		numTransactionTxt.sendKeys(strNumTransaction);
		return this;
	}
	
	public CustomizedStatementGuru99 clkAccSubmit() {
		accSubmitBtn.click();
		return this;
	}
	
	
	
	
	
	
	
	


}
