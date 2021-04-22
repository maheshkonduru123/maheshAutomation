package locatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocatorExample {
	public WebDriver driver;
	
	
	@Test()
	public void testCase1() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.cssSelector("#email")).sendKeys("Hello");//for id-->#
		//driver.findElement(By.cssSelector(".inputtext _55r1 _6luy _9npi")).sendKeys("Hello");//for class-->.
		driver.findElement(By.cssSelector("[class='inputtext _55r1 _6luy _9npi']")).sendKeys("Hello");//for any attribute [attribute='value']
	}

}
