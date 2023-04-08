package ScreenshotProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		  File Scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File destination = new File("C:\\Users\\DELL\\Desktop\\Screenshot\\Screenshot.jpg"); 
		  FileHandler.copy(Scr, destination);
	}
	
}
