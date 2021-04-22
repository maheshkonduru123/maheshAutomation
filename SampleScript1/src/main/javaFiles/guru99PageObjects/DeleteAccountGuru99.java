package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountGuru99 {
	public WebDriver driver;
	
	public DeleteAccountGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@href='deleteAccountInput.php']")
    WebElement deleteaccountBtn;
	
	@FindBy(xpath="//*[@name='accountno']")
    WebElement accountNOTxt;
	
	@FindBy(xpath="//*[@type='submit']")
    WebElement submitBtn;
	
	
	public DeleteAccountGuru99 clkDeleteAccountGuru() {
		deleteaccountBtn.click();
  		return this;
      }

	public DeleteAccountGuru99 enterAccountNo(String strAccountNo) {
		accountNOTxt.sendKeys(strAccountNo);
		return this;
      }

	
	public DeleteAccountGuru99 clkSubmit() {
		submitBtn.click();
  		return this;
}}
