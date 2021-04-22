package guru99TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import guru99PageObjects.LoginGuru99;
import guru99PageObjects.WithdrawlFormGuru99;
import resources.Base;
import utility.DBExcelUtility;

public class WithdrawlFormTest extends Base {	
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
			
			WithdrawlFormGuru99 wf=new WithdrawlFormGuru99(driver);
			wf.clkWithdrawlForm();
			wf.enterAccountNo(testData.getField("AccountNo"));
			wf.enterAmount(testData.getField("Amount"));
			wf.enterDescription(testData.getField("Description"));
			wf.clkAccSubmit();			
}}}
