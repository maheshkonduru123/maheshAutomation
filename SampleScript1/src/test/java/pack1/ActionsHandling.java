package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHandling {

	
public static void main(String[] args) throws InterruptedException {
		
		//browser setup code
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		//browser launch code
		WebDriver driver=new ChromeDriver();
		//browser maximize code
		driver.manage().window().maximize();
			
		driver.get("https://demoqa.com/menu/");
		
		WebElement mainItem=driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		WebElement subItem1=driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		WebElement subItem2=driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(mainItem).moveToElement(subItem1).moveToElement(subItem2).click().build().perform();
		
		
		
		
	}

}
