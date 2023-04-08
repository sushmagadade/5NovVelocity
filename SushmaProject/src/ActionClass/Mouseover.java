package ActionClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	 
	  driver.get("https://sellglobal.ebay.in/seller-center/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	  WebElement yes = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	  yes.click();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  
//	  WebElement ship=driver.findElement(By.xpath("(//a[@class='ekit-menu-nav-link'])[7]"));
//	  Actions act = new Actions(driver);
//	  act.moveToElement(ship).build().perform();
	 
	  
	

	}

}
