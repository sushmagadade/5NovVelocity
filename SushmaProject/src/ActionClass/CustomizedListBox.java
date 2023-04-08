package ActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		Actions act = new Actions(driver);
		act.moveToElement(button).perform();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@href='/account/orders?link=home_orders']"));
	
		//act.moveToElement(login).perform();//moving angular brace to login element
		act.click(login).perform();
	

	}

}
