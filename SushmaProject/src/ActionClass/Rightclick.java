package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();//maximize url
	   
	   driver.get("https://demoqa.com/buttons");//open url
	   
	   WebElement button= driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	        Actions act = new Actions(driver);
	        act.contextClick(button).build().perform();
	   
	   
	   
	   

	}

}
