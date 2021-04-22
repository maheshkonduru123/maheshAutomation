package locatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassNameLocatorExample {
	public WebDriver driver;
	
	
	@Test()
	public void testCase1() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']")).sendKeys("Hello");
	}

}
