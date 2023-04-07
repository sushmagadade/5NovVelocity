package Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Education.Logout;
import Education.Progress;
import Education.Teachers;
import Education.khan_Login;

public class CrossBrowser {
	
		WebDriver driver;
		khan_Login lo;
	    Teachers teacher ;
		Logout logout;
		Progress progress;
		
		@Parameters("browser")
		
		
		@BeforeTest
		
		public void openBrowser(String browsername) {
			System.out.println(browsername);
			
			if (browsername.equals("Chrome")) {
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	        driver = new ChromeDriver(); // upcasting
			}

			if (browsername.equals("Firefox")) {
				
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		        driver = new FirefoxDriver(); // upcasting
				}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
			driver.get("https://www.khanacademy.org/");
			
		}
		
		
		@BeforeClass
		public void beforeClass() {
			
			 lo= new khan_Login(driver);
			teacher = new Teachers(driver);
		 logout = new Logout(driver);
		 progress = new Progress(driver);
	        
		}
		
		@BeforeMethod
		public void beforeMethod() {
			lo.login();
			lo.username();
			lo.password();
			lo.submit();
			
		}
		@Test
		public void To_verify_the_TeacherPage() {
			 teacher = new Teachers(driver);
			 teacher.Teachers();

			
//			String url = driver.getCurrentUrl();
//			Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/teacher","Teachers page URL not found");
			
		}
		@Test
		public void To_verify_the_ProgressPage() {
			 progress=new Progress(driver);
			progress.Progress();

//			String url = driver.getCurrentUrl();
//			Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/progress");
//			
		}
		@AfterMethod
		
		public void afterMethod() {
			 logout.Myprofile();
			 logout.Loginout();
		}
		
		@AfterClass

		public void afterClass() {
			
			 logout =null;
			 lo = null;
			 teacher =null;
				
		}
		
		@AfterTest
		public void afterTest() {
			System.gc(); // Garbage collector object delete memory clear
			driver.close();
		}
		
		
		
		

	}
			


