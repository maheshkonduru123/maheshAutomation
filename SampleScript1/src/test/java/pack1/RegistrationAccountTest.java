package pack1;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationAccountTest {

	
	public static void main(String[] args) throws InterruptedException {
		//browser setup code
				System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
				//browser launch code
				WebDriver driver=new ChromeDriver();
				//browser maximize code
				driver.manage().window().maximize();
				//WebDriverManager.chromedriver().setup();
				//driver=new ChromeDriver();
					
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(3000);
				
				WebElement createNewAccountBtn=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", createNewAccountBtn);
				
				Thread.sleep(3000);
				WebElement firstNameTxt=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));
				firstNameTxt.sendKeys("abc");
				
				WebElement surNameTxt=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
				surNameTxt.sendKeys("xyz");
				
				//MobileNumber
				
				WebElement  mobileNumberTxt=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
				mobileNumberTxt.sendKeys("8801313370");
				
				
				
				Thread.sleep(5000);
				//New Password
				WebElement newPasswordTxt=driver.findElement(By.xpath("//input[@id='password_step_input']"));
				newPasswordTxt.sendKeys("maheshmahi");
				
				//Date Selection -->Day
				
				WebElement daySelection=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
				daySelection.sendKeys("20");
				
				
				//Month Selection
				WebElement monthSelection=driver.findElement(By.xpath("//select[@id='month']"));
				monthSelection.sendKeys("Nov");
				
				//Year Selection
				WebElement yearSelection=driver.findElement(By.xpath("//select[@id='year']"));
				yearSelection.sendKeys("1996");
				
				
		       //Gender Selection
				WebElement genderSelection=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
				genderSelection.click();
				
				
				
				//click SignUp button
				WebElement signupSelection=driver.findElement(By.xpath("//button[@name='websubmit']"));
				signupSelection.click();
				
			
				
				
	}
}
