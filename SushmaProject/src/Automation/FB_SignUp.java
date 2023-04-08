package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_SignUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sushma");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gadade");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9822302517");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sushma456");
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		s.selectByIndex(12);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByValue("9");
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1994");
		WebElement Female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Female.click();
		boolean Result = Female.isSelected();
		System.out.println(Result);
		if(Result==true) {
			System.out.println("element is selected");
			
		}
		else {
			System.out.println("element is not selected");
		}
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
