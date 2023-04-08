package LinkAnd_LinkValid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLink_Validation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		List<WebElement> link =driver.findElements(By.xpath("//a"));
		System.out.println(link.size());
		for(int i=0;i<=link.size();i++) {
			System.out.println(link.get(i).getText()+":"+link.get(i).getAttribute("href"));
		}
		
	

	}

}
