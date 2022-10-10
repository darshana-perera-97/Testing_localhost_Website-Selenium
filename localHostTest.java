package test_localhost_website;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
		driver.findElement(By.xpath("//*[@id=\"login-frm\"]/button[1]")).click();

		//change to employee tab
		driver.findElement(By.xpath("//*[@id=\"Employee\"]")).click();
		
		//click on new emp button
		driver.findElement(By.xpath("//*[@id=\"new_emp_btn\"]")).click();	
		
		
		//handling the window
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		
		//send data to window
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[1]/input[2]")).sendKeys("Perera");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[2]/input")).sendKeys("Darshana");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[3]/input")).sendKeys("DSP");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[4]/input")).sendKeys("SE");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[5]/input")).sendKeys("Staff");
		
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[2]/button")).click();
		
		//handling the alert box
		driver.switchTo().alert().accept();

	}

}
