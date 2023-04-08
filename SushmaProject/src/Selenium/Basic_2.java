package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_2 {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);      // stop for 3 sec
		
		driver.close();//current tab closed
		driver.quit();//current browser closed

		
		String title = driver.getTitle(); 
		System.out.println(title);
		
		String exptitle = "online Shopping Site for Mobiles,Electronics,Furniture";
		
		if (title.equalsIgnoreCase(exptitle)) {
			System.out.println("Nevigate to correct page");
		}
		else {
			System.out.println("Nevigate to invalid page");
		}	
		}
		
	}   


