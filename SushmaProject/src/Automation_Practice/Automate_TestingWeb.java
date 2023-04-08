package Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_TestingWeb {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Sushma");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Lavte");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Aurangabad");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gadadesushma@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9822302517");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		//driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		 WebElement Lang = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s = new Select(Lang);
		s.selectByValue("Android");
		 WebElement Country = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		// Select s1 = new Select(Country);
		 
		
	}
}
//a[text()='English']