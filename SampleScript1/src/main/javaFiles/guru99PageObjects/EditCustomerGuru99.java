package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerGuru99 {
	public WebDriver driver;

	public EditCustomerGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@href='EditCustomer.php']")
	WebElement editCutomerBtn;

	@FindBy(xpath = "//input[@name='cusid']")
	WebElement customerIdTxt;

	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submitBtn;
	
	public EditCustomerGuru99 clkEditCutomer() {
		editCutomerBtn.click();
		return this;
	}

	public EditCustomerGuru99 enterCustomerId(String strCustomerid) {
		customerIdTxt.sendKeys(strCustomerid);
		return this;
	}

	public EditCustomerGuru99 clkSubmit() {
		submitBtn.click();
		return this;
	}
	
}
