package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingOrNewTabsHandling {

	public static void main(String[] args) throws InterruptedException {

		// browser setup code
		System.setProperty("webdriver.chrome.driver",
				"C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		// browser launch code
		WebDriver driver = new ChromeDriver();
		// browser maximize code
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");
		
		String parentWindow=driver.getWindowHandle();//parent window details

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));
		// driver.switchTo().frame(1);

		// driver.switchTo().frame("a077aa5e");//iframe name attribute value
		// driver.switchTo().frame("a077aa5e");//iframe id attribute value

		WebElement imgEle = driver.findElement(By.xpath("html/body/a/img"));
		imgEle.click();
		
		//multiple windows
		
		Set<String> allWindows=driver.getWindowHandles();//all windows details-->parent and child
		
		//for each loop
		for(String windows:allWindows) {
			if(!windows.equals(parentWindow)) {
				driver.switchTo().window(windows);
				//driver.close();//current driver instance
				driver.quit();//all driver instances
				
				//WebElement homeEle=driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[1]/a/span/span"));
				//homeEle.click();
			}
		}
		
		
		
		

	}

}
