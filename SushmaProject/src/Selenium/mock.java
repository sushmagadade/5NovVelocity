package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		
       driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("gadadesushma@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.xpath(" //input[@name='pass']")).sendKeys(" officer");
       Thread.sleep(2000);
       driver.findElement(By.xpath(" //button[@type='submit']")).sendKeys(" login");
       Thread.sleep(3000);
       driver.quit();
       	   
}
}