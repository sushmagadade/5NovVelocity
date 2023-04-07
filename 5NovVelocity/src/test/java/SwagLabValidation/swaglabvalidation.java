package SwagLabValidation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Shopping.LinkClick;
import Shopping.LinkClick2;
import Shopping.Loginout;
import Shopping.SwagLabLogin;

public class swaglabvalidation {
	WebDriver driver;
	SwagLabLogin login;
	@BeforeClass
	public void beforeclass () {
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
     @BeforeMethod
     public void beforemethod() {
    	  login = new SwagLabLogin(driver);
    	  login.username();
    	  login.password();
    	  login.login();
     }
     @Test
     public void test() {
     LinkClick link = new LinkClick(driver);
     link.backpack();
     link.addtocart();
     link.backtoproduct1();
     String url = driver.getCurrentUrl();
     System.out.println(url);
     Assert.assertEquals(url, "https://www.saucedemo.com/inventory-item.html?id=4");
     
     
     
}
//     @Test
//     public void test1() {
//    	 LinkClick2 link2 = new LinkClick2 (driver);
//    	 link2.backpack1();
//    	 link2.addtocart1();
//    	 String url1 = driver.getCurrentUrl();
//    	 System.out.println(url1);
//    	 Assert.assertEquals(url1,"https://www.saucedemo.com/inventory-item.html?id=0");
//	}
     @AfterMethod
     public void aftermethod() {
    	 Loginout logout = new Loginout(driver);
     }
     @AfterClass
     public void afterclass() {
    	// driver.close();
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
}