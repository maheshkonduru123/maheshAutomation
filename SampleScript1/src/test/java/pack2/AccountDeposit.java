package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AccountDeposit {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		//browser launch code
		WebDriver driver=new ChromeDriver();
		//browser maximize code
		driver.manage().window().maximize();
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/manager/DepositInput.php");
		
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("123456789");;
		
		driver.findElement(By.xpath("//input[@name='ammount']")).sendKeys("25000");;
		
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("xyzmhpo");;
		
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
	}

}
