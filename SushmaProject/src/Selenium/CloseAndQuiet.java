package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuiet {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.flipkart.com/");
		//driver.get("http://demo.automationtesting.in/window.html");
		//driver.close();//close only one window
		driver.manage().deleteAllCookies();
		//driver.quit();
	
	}

}
