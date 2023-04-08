package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		//find alert button and perform click action
		driver.findElement(By.xpath("//button[@id='alert']")).click();//simple alert
		
		//Switch to alert window and accept alert
		driver.switchTo().alert().accept();//ok button is clicked
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();//confirm alert
		
		driver.switchTo().alert().accept();//to click on ok button
		//driver.switchTo().alert().dismiss();//to click on cancel button
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();//promt alert
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert().sendKeys("sushma");
		driver.switchTo().alert().accept();//to ok alert
		
		
	
		
	}

}
