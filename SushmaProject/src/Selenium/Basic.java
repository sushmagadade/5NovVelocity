package Selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {
	public static void main(String[] args) {
		
	
	
//System.setProperty("webdriver.firefox.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
           //  WebDriver driver = new ChromeDriver();//upcasting
            // FirefoxDriver driver1 = new FirefoxDriver(); 
		       WebDriver driver = new FirefoxDriver();//interface concept
		
	         driver.get("https://www.google.com/");
	         
	}
}
