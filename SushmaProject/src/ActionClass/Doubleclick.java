package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();//maximize url
	    driver.get("https://demoqa.com/buttons");//open url
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//wait
	    
	    WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	    Actions act = new Actions(driver);
	    act.doubleClick(button).build().perform();
	    
	    
	    
	    
	    
	    

	}

}
