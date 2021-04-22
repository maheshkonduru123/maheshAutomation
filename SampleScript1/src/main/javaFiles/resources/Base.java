package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

public class Base {

	public WebDriver driver;
	public Properties prop;
	String usrID = null;
	String pwd = null;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		/*
		 * String dir=System.getProperty("user.dir"); String
		 * dataPropLoc=dir+"\\src\\main\\javaFiles\\resources\\data.properties";
		 */

		String dataPath = System.getProperty("user.dir") + "\\src\\main\\javaFiles\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(dataPath);
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public void launchApplication() {
		String environment = prop.getProperty("environment");
		if (environment.equalsIgnoreCase("qa")) {
			String qaUrl = prop.getProperty("guru99QaUrl");
			driver.get(qaUrl);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			usrID = prop.getProperty("guru99UsernameQa");
			pwd = prop.getProperty("guru99PasswordQa");
		} else if (environment.equalsIgnoreCase("uat")) {
			String uatUrl = prop.getProperty("guru99UatUrl");
			driver.get(uatUrl);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			usrID = prop.getProperty("guru99UsernameUat");
			pwd = prop.getProperty("guru99PasswordUat");
		} else if (environment.equalsIgnoreCase("prod")) {
			String prodUrl = prop.getProperty("guru99ProdUrl");
			driver.get(prodUrl);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
	}

	public String[] properties() {

		String testDataPath = System.getProperty("user.dir") + "\\src\\main\\javaFiles\\dataSheet\\TestData.xlsx";
		String[] props = new String[3];
		props[0] = usrID;
		props[1] = pwd;
		props[2] = testDataPath;
		return props;
	}

	@AfterTest()
	public void tearDown() {
		driver.close();
	}

	/*
	 * public static void main(String[] args) throws IOException { Base obj=new
	 * Base(); obj.initializeDriver(); }
	 */

}
