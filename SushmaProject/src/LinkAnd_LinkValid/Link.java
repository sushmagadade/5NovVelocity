package LinkAnd_LinkValid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.partialLinkText("Backpack")).click();
		driver.findElement(By.cssSelector("inventory_details_name large_size")).click();

	}

}
