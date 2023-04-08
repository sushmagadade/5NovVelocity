package LinkAnd_LinkValid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin_linkV {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		System.out.println(link.size());
		for (int i = 0; i < link.size(); i++) {
	    System.out.println(link.get(i).getText() + ":" + link.get(i).getAttribute("href"));
		if (link.get(i).getText().equals("Forgot password?")) {
		System.out.println(link.get(i).getAttribute("href").equals("https://www.linkedin.com/checkpoint/rp/request-password-reset"));
		  }
		if(link.get(i).getText().equals("Join now")) {
			System.out.println(link.get(i).getAttribute("href").equals("https://www.linkedin.com/signup/cold-join"));
		}	
		
	
			}	
		
	}
}


