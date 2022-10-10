package test_localhost_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class localHostTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//local host open website
		driver.navigate().to("http://localhost/employee/admin/index.php");

		
		//maximizing the window
		driver.manage().window().maximize();

		
		//pass the values to the login page
		driver.findElement(By.xpath("//*[@id=\"login-frm\"]/div[1]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"login-frm\"]/div[2]/input")).sendKeys("admin123");
	
		//press login button
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		
		

	}

}
