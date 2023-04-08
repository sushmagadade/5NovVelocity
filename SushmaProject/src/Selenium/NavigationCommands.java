package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getTitle());//instead of title we can use url also
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
