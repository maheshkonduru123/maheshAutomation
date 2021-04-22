package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerGuru99 {
	private static final String AddressTxt = null;

	public WebDriver driver;

	public CreateCustomerGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@href='addcustomerpage.php']")
	WebElement newCustomerBtn;

	@FindBy(xpath = "//input[@name='name']")
	WebElement customerNameTxt;

	@FindBy(xpath = "//input[@value='m']")
	WebElement maleGenderRdBtn;

	@FindBy(xpath = "//*[@value='f']")
	WebElement femaleGenderRdBtn;

	@FindBy(xpath = "//*[@name='dob']")
	WebElement DateOfBirthTxt;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement addressTxt;

	@FindBy(xpath = "//input[@name='city']")
	WebElement cityTxt;

	@FindBy(xpath = "//input[@name='state']")
	WebElement stateTxt;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pinTxt;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement mobileNoTxt;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailTxt;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTxt;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;

	public CreateCustomerGuru99 clkNewCustomer() {
		newCustomerBtn.click();
		return this;

	}

	public CreateCustomerGuru99 enterCustomerName(String strCustomerName) {
		customerNameTxt.sendKeys(strCustomerName);
		return this;
	}

	public CreateCustomerGuru99 clickGenderMale() {
		maleGenderRdBtn.click();
		return this;
	}
	
	public CreateCustomerGuru99 clickGenderFemale() {
		femaleGenderRdBtn.click();
		return this;
	}

	public CreateCustomerGuru99 enterDateOfBirth(String strDateOfBirth) {
		DateOfBirthTxt.sendKeys(strDateOfBirth);
		return this;
	}

	public CreateCustomerGuru99 enterAddress(String strAddress) {
		addressTxt.clear();
		addressTxt.sendKeys(strAddress);
		return this;
	}

	public CreateCustomerGuru99 enterCity(String strCity) {
		cityTxt.clear();
		cityTxt.sendKeys(strCity);
		return this;
	}
	
	public CreateCustomerGuru99 enterState(String strState) {
		stateTxt.clear();
		stateTxt.sendKeys(strState);
		return this;
	}

	public CreateCustomerGuru99 enterPin(String strPin) {
		pinTxt.clear();
		pinTxt.sendKeys(strPin);
		return this;
	}

	public CreateCustomerGuru99 enterMobileNo(String strMobileNo) {
		mobileNoTxt.clear();
		mobileNoTxt.sendKeys(strMobileNo);
		return this;

	}

	public CreateCustomerGuru99 enterEmail(String strEmail) {
		emailTxt.sendKeys(strEmail);
		return this;

	}

	public CreateCustomerGuru99 enterPassword(String strPassword) {
		passwordTxt.sendKeys(strPassword);
		return this;
	}
	public CreateCustomerGuru99 clkSubmit() {
		submitBtn.click();
		return this;
	}

}
