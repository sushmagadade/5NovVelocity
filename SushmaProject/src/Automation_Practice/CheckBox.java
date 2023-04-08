package Automation_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(check.size());
		for(int i=0;i<check.size();i++) {
		   check.get(i).click();
		  boolean Result = check.get(i).isSelected();
		  if(Result==true) {
			  System.out.println("it is selected");
		  }
		  else {
			  System.out.println("is not selected");
		  }
		}

	}

}
