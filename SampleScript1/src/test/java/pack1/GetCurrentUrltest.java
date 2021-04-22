package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrltest {

	
public static void main(String[] args) {
		
		//browser setup code
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		//browser launch code
		WebDriver driver=new ChromeDriver();
		//browser maximize code
		driver.manage().window().maximize();
		
			
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//get present url
		
		String  presentUrl=driver.getCurrentUrl();
		System.out.println(presentUrl);
		
		
		System.out.println("Passed");
		driver.close();
		
		
		
		
	}
}
