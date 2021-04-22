package pack2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Guru99EditCustomer {

	public static void main(String[] args) {
		//browser setup code
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
		//browser launch code
		WebDriver driver=new ChromeDriver();
		//browser maximize code
		driver.manage().window().maximize();
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/manager/EditCustomer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("32793");
		
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		
		
	}

}
