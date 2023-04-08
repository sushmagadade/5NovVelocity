package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("Admin");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
