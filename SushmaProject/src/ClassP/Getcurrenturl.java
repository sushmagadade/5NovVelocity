package ClassP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {

	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	 String expurl="https://www.flipkart.com/";
	 
	 if(url==expurl) {
		 System.out.println("nevigate to valid page");
	 }
	 else {
		 System.out.println("nevigate to invalid page");
	 }
      
	 
	}

}
