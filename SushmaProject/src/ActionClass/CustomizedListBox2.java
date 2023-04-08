package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBox2 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32.zip.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Source1 = driver.findElement(By.xpath("//a[text()='More']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Source1).perform();
		Thread.sleep(3000);
		WebElement more = driver.findElement(By.xpath("//a[text()='Charts']"));
		act.click(more).perform();
		
		

	}

}
