package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemoP
{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/iframe/");
		driver.findElement(By.xpath("//input[@class='select2-search__field']"));

	}

}
