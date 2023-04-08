package ClassP;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		Dimension d = new Dimension(200,300);
		driver.manage().window().setSize(d);
		
		Point p = new Point(100,400); 
		driver.manage().window().setPosition(p);
		
		

	}

}
