package Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_Lab_A {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(3000);
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn_primary btn_small')]")).click();
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sauce Labs Onesie")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();

		driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("back-to-products")).click();

	}

}
