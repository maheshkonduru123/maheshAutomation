package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FundTransfer {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		//browser launch code
		WebDriver driver=new ChromeDriver();
		//browser maximize code
		driver.manage().window().maximize();
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/manager/FundTransInput.php");
		
		driver.findElement(By.xpath("//input[@name='payersaccount']")).sendKeys("1234556");
		
		driver.findElement(By.xpath("//input[@name='payeeaccount']")).sendKeys("54321");
		
		driver.findElement(By.xpath("//input[@name='ammount']")).sendKeys("234567");
		
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		
        driver.switchTo().alert().accept();
				
	}
}
