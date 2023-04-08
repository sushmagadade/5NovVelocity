package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Poppop {
	public static void main(String[] args) {
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(Option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gadadesushma@gmail.com");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("officer");
	    driver.findElement(By.xpath("//button[@value='1']")).click();
		
	}

}
