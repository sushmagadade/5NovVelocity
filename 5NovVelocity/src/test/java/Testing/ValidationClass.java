package Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Education.Logout;
import Education.Teachers1;
import Education.khan_Login;

public class ValidationClass {
	WebDriver driver;
	khan_Login login;
	Teachers1 teacher;


	@BeforeClass

	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.khanacademy.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
	}

	@BeforeMethod
	public void beforeMethod() {
		login = new khan_Login(driver);
		login.login();
		login.username();
		login.password();
		login.submit();

	}

//	@Test
//	public void To_verify_the_TeacherPage() {
//		teacher = new Teachers(driver);
//		teacher.Teachers();
//		teacher.Addemail();
//		teacher.submitteacher();
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/teachers");
//		String title = driver.getTitle();
//		System.out.println(title);
		
		//Assert.assertEquals(title, "");
		
	@Test
	public void Teacher() {
		Teachers1 teacher = new Teachers1 (driver);
			teacher.Teach();
			teacher.Entercode();
			teacher.Enteryourcode();
			teacher.Comfirm();
			teacher.Back();
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Assert.assertEquals(url, "https://www.khanacademy.org/");
		
	}	
			
			
		 @AfterMethod
         public void AfterMethod() {
			Logout logout = new Logout(driver);
			logout.Myprofile();
			logout.Loginout();
		}
		@AfterClass
		public void afterClass() {
			//driver.close();
		}
			
			
		
		
		
}
