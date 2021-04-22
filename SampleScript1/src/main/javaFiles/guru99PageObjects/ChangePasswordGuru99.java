package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordGuru99 {
	public WebDriver driver;
	
	public ChangePasswordGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@href='PasswordInput.php']")
    WebElement changePasswordBtn;
	
	@FindBy(xpath="//*[@name='oldpassword']")
    WebElement oldPasswordTxt;
	
	@FindBy(xpath="//*[@name='newpassword']")
    WebElement newpasswordTxt;
	
	@FindBy(xpath="//*[@name='confirmpassword']")
    WebElement confirmpasswordTxt;
	
	@FindBy(xpath="//*[@type='submit']")
    WebElement submitBtn;
	
	public ChangePasswordGuru99 clkChangePassword() {
		changePasswordBtn.click();
  		return this;
      }


	public ChangePasswordGuru99 enterOldPAssword(String strOldPassword) {
		oldPasswordTxt.sendKeys(strOldPassword);
  		return this;
      }

       
	public ChangePasswordGuru99 enterNewPassword(String strNewPassword) {
		newpasswordTxt.sendKeys(strNewPassword);
  		return this;
      }

	public ChangePasswordGuru99 enterConfirmPassword(String strConfirmPassword) {
		confirmpasswordTxt.sendKeys(strConfirmPassword);
  		return this;
      }

	public ChangePasswordGuru99 clkSubmit() {
		submitBtn.click();
  		return this;
	
}}
