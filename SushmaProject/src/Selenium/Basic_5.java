package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.flipkart.com");
        Thread.sleep(3000);
        Diamention d = new Diamention(200,300);
        
	}

}
