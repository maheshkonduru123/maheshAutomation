package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		// browser setup code
		System.setProperty("webdriver.chrome.driver",
				"C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		// browser launch code
		WebDriver driver = new ChromeDriver();
		// browser maximize code
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));
		// driver.switchTo().frame(1);

		// driver.switchTo().frame("a077aa5e");//iframe name attribute value
		// driver.switchTo().frame("a077aa5e");//iframe id attribute value

		WebElement imgEle = driver.findElement(By.xpath("html/body/a/img"));
		imgEle.click();

	}

}
