package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_3 {
	
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.youtube.com/");
		
		Thread.sleep(30000);
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String expurl = " https://www.youtube.com/";
		
		if(url.equalsIgnoreCase(expurl)) {
		     System.out.println("nevigate to correct page");
		}
		
		else {
			System.out.println("nevigate to invalid page");
		}
		
	}

	
	
}
