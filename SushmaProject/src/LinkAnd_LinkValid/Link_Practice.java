package LinkAnd_LinkValid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.guru99.com/test/newtours/");
		List<WebElement> Link = driver.findElements(By.xpath("//a"));
		System.out.println(Link.size());
	

	}

}
