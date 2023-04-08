package ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty(null, null);
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.album.alexflueras.ro/index.php");
	    driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0, 400)");//down
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(0,-400)");//up
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(2000,0)");//Right
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(-2000,0)");//Left
		
		

	}

}
