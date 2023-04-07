package Testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Education.khan_Login;

public class TestingLogin {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
		
		
		khan_Login login = new khan_Login(driver);
		  login.login();
		  login.username();
		  login.password();
		  login.submit();
		
		  
	}

}
