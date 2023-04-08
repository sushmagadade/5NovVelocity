package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		Thread.sleep(3000);
		Set<String> id = driver.getWindowHandles();
		ArrayList<String>ai=new ArrayList<String>(id);
		String Cbadd = ai.get(1);//Copy browser address
	
		
		  driver.switchTo().window(Cbadd); Thread.sleep(3000);
		  driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		  driver.switchTo().window(ai.get(0));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		  driver.switchTo().window(ai.get(1));
		  driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
		  driver.switchTo().window(ai.get(0));
		


	}
	//span[@class='menu-text'])[1]

}
