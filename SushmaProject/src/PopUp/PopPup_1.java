package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopPup_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
	  /*  driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("yes");
	    Thread.sleep(3000);
	

	}

}
