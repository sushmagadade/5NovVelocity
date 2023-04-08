package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_commands {
	public static void main(String [] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath(" //*[@id=\"email\"]"));
		WebElement passward = driver.findElement(By.xpath(" //*[@id=\"pass\"]"));
		
		if(email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("gadadesushma@gmail");
		}
	}

}
