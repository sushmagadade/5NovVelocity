package SwagLabValidation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Education.Logout;
import Shopping.Backtoproduct;
import Shopping.LinkClick;
import Shopping.LinkClick2;
import Shopping.LinkClick3;
import Shopping.Loginout;
import Shopping.SwagLabLogin;

public class TestingSwag {
	WebDriver driver;
	 SwagLabLogin lo;
	 LinkClick link;
	 LinkClick2 link2;
	 LinkClick3 link3;
	 Loginout log;
	 
	 
	@Parameters("browser")
	 
	@BeforeTest
	public void openBrowser(String browsername) {
		System.out.println(browsername);
		if(browsername.equals("Chrome")) {
	    driver = new ChromeDriver();
	}
	
	    if(browsername.equals("Firefox")) {
	    	driver= new FirefoxDriver();
	    }
	  //driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  		driver.get("https://www.saucedemo.com/");
	  	
	}
	@BeforeClass
	public void BeforeClass() {
		 lo =  new SwagLabLogin(driver);
		 link = new LinkClick(driver);
		 link2 = new LinkClick2(driver);
		 link3 = new LinkClick3(driver);
		 
	}	
	
	@BeforeMethod
	
	public void perform_to_login() {
		 SwagLabLogin lo = new SwagLabLogin(driver);
		 lo.username();
		 lo.password();
		 lo.login();
	}
	
	@Test
	
	public void To_Verify_Swaglab_page() {
		LinkClick link = new LinkClick(driver);
		link.backpack();
		link.addtocart();
	    String url = driver.getCurrentUrl();	
	    System.out.println(url);
	    Assert.assertEquals(url, "https://www.saucedemo.com/inventory-item.html?id=4");
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, "Swag Labs");
	    		
	}
//	@Test
//	
//	public void To_verify_backtoproduct(){
//		Backtoproduct back= new Backtoproduct(driver);
//		back.backtoproduct1();
//		
//		
//	}
	
	@Test(enabled = false)
	public void To_Verify_Swaglab1_Page() {
		LinkClick2 link2 = new LinkClick2(driver);
		link2.backpack1();
		link2.addtocart1();
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		Assert.assertEquals(url2, "https://www.saucedemo.com/inventory-item.html?id=0");
	    String title2 = driver.getTitle();
	    System.out.println(title2);
	    Assert.assertEquals(title2, "Swag Labs");
	}
	@Test(enabled=false)
	public void To_Verify_Swaglab2_Page() {
		LinkClick3 link3 = new LinkClick3(driver);
		link3.bolttshirt();
		link3.addtocart2();
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		Assert.assertEquals(url3, "https://www.saucedemo.com/inventory-item.html?id=1");
		String title3 = driver.getTitle();
		System.out.println(title3);
		Assert.assertEquals(title3, "Swag Labs");
		
				
	}
	    
	
	
	@AfterMethod
	
	public void aftermethod() {
	
		log.perform_to_button();
		log.perform_to_logoutbutton();
		
	}
	 @AfterClass
	 
	 public void afterclass() {
		 lo =  null;
		 link = null;
		 link2 = null;
		 link3 = null;
		 
		 
		 
	 }
	 @AfterTest
	 public void aftertest() {
		 System.gc();//Garbage Collector object delete memory clear
		 driver.close();
	 }

	

}
