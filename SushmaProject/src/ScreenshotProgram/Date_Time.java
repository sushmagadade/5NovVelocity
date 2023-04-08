package ScreenshotProgram;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Date_Time {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		  File Scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Date d= new Date();
		  String date = d.toString();
		  String A = date.replace(" ", "_").replace(":", "_");//for replacing colon or space we use underscore
		  System.out.println(A);
		  File destination = new File("C:\\Users\\DELL\\Desktop\\Screenshot\\Screenshot_"+A+" .jpg"); 
		  FileHandler.copy(Scr, destination);
		  
	}

}
