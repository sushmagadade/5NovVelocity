package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Basic {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(Iframe);//changed selenium focus from main page to Iframe
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();

	}

}
