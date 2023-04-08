package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.linkedin.com/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@required='true'])[1] ")).sendKeys("9822302517");
		driver.findElement(By.xpath("(//input[@required='true'])[2] ")).sendKeys("anu123");	
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/button"));
		
		
		
		
	}

}
