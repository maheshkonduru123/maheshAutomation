package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99LoginTestCase {
	
	public static void main(String[] args) throws InterruptedException {
		//browser setup code
				System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
				//browser launch code
				WebDriver driver=new ChromeDriver();
				//browser maximize code
				driver.manage().window().maximize();
				//WebDriverManager.chromedriver().setup();
				//driver=new ChromeDriver();
					
				//driver.get("http://demo.guru99.com/V4/manager/addcustomerpage.php");
				driver.get("http://demo.guru99.com/v4/");
				
				driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr317797");
				
				driver.findElement(By.xpath("//*[@type='password']")).sendKeys("hUzUnug");
				
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				
				//scroll down vertically code --with out web element
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * js.executeScript("window.scrollBy(0,1000)");
				 */
				
				//scroll down vertically code --with out web element
				
				//logout code
				
				WebElement logOutEle=driver.findElement(By.xpath("//a[@href='Logout.php']"));
				
				JavascriptExecutor x = (JavascriptExecutor) driver;
				x.executeScript("arguments[0].scrollIntoView(true);",logOutEle);
				
				logOutEle.click();
				Thread.sleep(3000);
				
				driver.switchTo().alert().accept();
				
				
	}

}
