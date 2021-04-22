package guru99TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import guru99PageObjects.CreateCustomerGuru99;
import guru99PageObjects.EditCustomerGuru99;
import guru99PageObjects.LoginGuru99;
import resources.Base;
import utility.DBExcelUtility;

public class EditCustomerTest extends Base {
	
public WebDriver driver;
	
	
	@BeforeTest()
	public void initialize() throws IOException {
		 driver=initializeDriver();
	}
	
	@Test()
	public void editCutomerTestCase() throws FilloException {
		DBExcelUtility excelData=new DBExcelUtility();
		Recordset testData=excelData.getRecordset(properties()[2], "Guru99App", this.getClass().getSimpleName());
		
		while(testData.next()) {
			launchApplication();
			LoginGuru99 login=new LoginGuru99(driver);
			login.enterUserName(properties()[0]).enterPassword(properties()[1]).clkLogin();
			EditCustomerGuru99 ec=new EditCustomerGuru99(driver);
			ec.clkEditCutomer().enterCustomerId(testData.getField("CustomerID")).clkSubmit();
			CreateCustomerGuru99 cc=new CreateCustomerGuru99(driver);
			cc.enterAddress(testData.getField("Address"));
			cc.enterCity(testData.getField("City"));
			cc.enterState(testData.getField("State"));
			cc.enterPin(testData.getField("Pin"));
			cc.enterMobileNo(testData.getField("MobileNo"));
			cc.clkSubmit();
		}
	}

}
