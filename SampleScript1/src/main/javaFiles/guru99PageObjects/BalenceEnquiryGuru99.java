package guru99PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalenceEnquiryGuru99 {
	public WebDriver driver;
	
	public BalenceEnquiryGuru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


      @FindBy(xpath="//*[@href='BalEnqInput.php']")
      WebElement balenceEnquiryBtn;
      
      @FindBy(xpath="//*[@name='accountno']")
      WebElement accountNoTxt;
      
      @FindBy(xpath="//*[@type='submit']")
      WebElement submitBtn;
      
      public BalenceEnquiryGuru99 clkBalenceEnquiry() {
  		balenceEnquiryBtn.click();
  		return this;
      }

      public BalenceEnquiryGuru99 enterAccountNo(String strAccountNo) {
    		accountNoTxt.sendKeys(strAccountNo);
    		return this;
    	}
      
      public BalenceEnquiryGuru99 clkSubmit() {
  		submitBtn.click();
  		return this;
  	}}
      
     