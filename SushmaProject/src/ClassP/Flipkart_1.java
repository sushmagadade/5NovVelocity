package ClassP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "webdriver.chrome.driver\",\"C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String exptitle = "online Shopping Site for Mobiles,Electronics,Furniture";
		if(title==exptitle) {
			System.out.println("nevigate to correct page");
		}
			else {
				System.out.println("nevigate to invalid page"); 
				
			}
		driver.quit();
		
		}
		

	}


