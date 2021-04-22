package pack2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99NewCustomer {
	
	public static void main(String[] args) {
		//browser setup code
				System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTraining\\JavaPrograms\\SampleScript1\\Drivers\\chromedriver.exe");
				//browser launch code
				WebDriver driver=new ChromeDriver();
				//browser maximize code
				driver.manage().window().maximize();
				//WebDriverManager.chromedriver().setup();
				//driver=new ChromeDriver();
					
				driver.get("http://demo.guru99.com/V4/manager/addcustomerpage.php");
				
				driver.findElement(By.xpath("//input[@name='name']")).sendKeys("mahesh");
				
				driver.findElement(By.xpath("//input[@value='m']")).click();
				
				driver.findElement(By.xpath("//input[@type='date']")).sendKeys("04-03-1996");
				
				driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("rosanuru rajupalem");
				
				driver.findElement(By.xpath("//input[@name='city']")).sendKeys("nellore");
				
				driver.findElement(By.xpath("//input[@name='state']")).sendKeys("andhra");
				
				driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("524126");
				
				driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("7659093804");
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("mahesh1234");
				
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mahi12345");
				
				driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
				

	




