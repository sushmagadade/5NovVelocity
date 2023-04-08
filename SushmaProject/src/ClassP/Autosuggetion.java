package ClassP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("oneplus");
		Thread.sleep(3000);
	    List<WebElement> options = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
	    
	    for(int i=0;i<options.size();i++) {
	    	System.out.println(options.get(i).getText());
	    }
	}
}
