package pack1;

/**
 * Java doc's
 * @author raju
 * @TestCaseName LoginTest
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	public static void main(String[] args) {
		
		//browser setup code
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		//browser launch code
		WebDriver driver=new ChromeDriver();
		//browser maximize code
		driver.manage().window().maximize();
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Hello Mahesh");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("maheshkonduru");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("mahesh");
		
		
		
	}

	
}
