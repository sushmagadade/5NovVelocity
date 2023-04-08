package Automation_Practice;

import java.time.Duration;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {
	public static void main(String[] args)   {
	    WebDriver driver = new ChromeDriver();

		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
	    

	
//		Thread.sleep(2000);
//		driver.findElement(By.className("oxd-text oxd-text--span oxd-main-menu-item--name")).click();
//		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		
		//driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		

	}
}
