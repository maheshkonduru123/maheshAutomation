package guru99TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import guru99PageObjects.DepositMoneyGuru99;
import guru99PageObjects.LoginGuru99;
import resources.Base;
import utility.DBExcelUtility;

public class DepositMoneyTest extends Base {
public WebDriver driver;
	
	
	@BeforeTest()
	public void initialize() throws IOException {
		 driver=initializeDriver();
	}
	
	@Test()
	public void depositMoneyTestCase() throws FilloException {
		DBExcelUtility excelData=new DBExcelUtility();
		Recordset testData=excelData.getRecordset(properties()[2], "Guru99App", this.getClass().getSimpleName());
		
		while(testData.next()) {
			launchApplication();
			LoginGuru99 login=new LoginGuru99(driver);
			login.enterUserName(properties()[0]).enterPassword(properties()[1]).clkLogin();
			
			DepositMoneyGuru99 dm=new DepositMoneyGuru99 (driver);
			dm.clkDeposit();
			dm.enterAccountNo(testData.getField("AccountNo"));
			dm.enterAmmount(testData.getField("Amount"));
			dm.enterDescription(testData.getField("Description"));
			dm.clkSubmit();
			
			
			
}
}
}