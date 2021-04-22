package guru99TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import guru99PageObjects.CreateCustomerGuru99;
import guru99PageObjects.LoginGuru99;
import resources.Base;
import utility.DBExcelUtility;

public class CreateCustomerTest extends Base {
public WebDriver driver;
	
	
	@BeforeTest()
	public void initialize() throws IOException {
		 driver=initializeDriver();
	}
	
	@Test()
	public void createNewCustomerTestCase() throws FilloException {
		DBExcelUtility excelData=new DBExcelUtility();
		Recordset testData=excelData.getRecordset(properties()[2], "Guru99App", this.getClass().getSimpleName());
		
		while(testData.next()) {
			launchApplication();
			LoginGuru99 login=new LoginGuru99(driver);
			login.enterUserName(properties()[0]).enterPassword(properties()[1]).clkLogin();
			CreateCustomerGuru99 cnc=new CreateCustomerGuru99(driver);
			cnc.clkNewCustomer().enterCustomerName(testData.getField("CustomerName"));
			if(testData.getField("Gender").equals("male")) {
				cnc.clickGenderMale();
			}
			else if(testData.getField("Gender").equals("female")){
				cnc.clickGenderFemale();
			}
			cnc.enterDateOfBirth(testData.getField("DataOfBirth"));
			cnc.enterAddress(testData.getField("Address"));
			cnc.enterCity(testData.getField("City"));
			cnc.enterState(testData.getField("State"));
			cnc.enterPin(testData.getField("Pin"));
			cnc.enterMobileNo(testData.getField("MobileNo"));
			cnc.enterEmail(testData.getField("EmailID"));
			cnc.enterPassword(testData.getField("Password"));
			cnc.clkSubmit();
		
			
		}
		
	}
}
