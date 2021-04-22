package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {
	

	
	
	public static void main(String[] args) throws InterruptedException {
		
		//browser setup code
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		//browser launch code
		WebDriver driver=new ChromeDriver();
		//browser maximize code
		driver.manage().window().maximize();
			
		driver.get("https://demoqa.com/alerts");
		
		WebElement generalEleBtn=driver.findElement(By.xpath("//button[@id='alertButton']"));
		generalEleBtn.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();//for ok button 
		
		
		WebElement confirmEleBtn=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmEleBtn.click();
		
		
		driver.switchTo().alert().dismiss();//for cancel button
		
		
		
		WebElement promtEleBtn=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promtEleBtn.click();
		
		
		driver.switchTo().alert().sendKeys("Hello Mahesh");
		
		driver.switchTo().alert().accept();
		
		
	}

	


}
