package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_SignUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/signup");
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sushma");
		//driver.findElement(By.partialLinkText("have an account?")).click();
		
	}

}
