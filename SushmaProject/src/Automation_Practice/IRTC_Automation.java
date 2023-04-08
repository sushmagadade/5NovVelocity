package Automation_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class IRTC_Automation {

	public static void main(String[] args) {
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(Option);

		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	    driver.manage().window().maximize();  

		driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("gadadesushma@gmail.com"); ////
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys("sushmaGadade@12"); 
		driver.findElement(By.xpath("//input[@name='cnfUsrPwd']")).sendKeys("sushmaGadade@12"); // WebElement lang =
		 WebElement lang = driver.findElement(By.xpath("(//div[@class='ng-tns-c65-7 ui-dropdown ui-widget ui-state-default ui-corner-all ui-dropdown-open']"));
		Actions act = new Actions(driver);
		act.click(lang).perform();
		WebElement english = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
		act.click(english).perform();

	}

}//input[@id='usrPwd']
//input[@name='cnfUsrPwd']