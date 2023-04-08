package Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Signup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sushma");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gadade");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9822302517");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anushree789");
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(12);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByValue("sept");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1994");
		WebElement Female = driver.findElement(By.className("_8esa"));
		boolean Result = Female.isSelected();
		if(Result==true) {
			System.out.println("select element");
			
		}
		else {
			System.out.println("not select");
		}
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.quit();
	
	}

}
