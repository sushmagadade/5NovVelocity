package Selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Date_Time {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 File dest = new File( "C:\\Screenshot\\"+"Screenshott_"+".jpg");
	    Date d = new Date();
	    String date=d.getDate()+"/"+d.getMonth()+"/" +d.getYear();	
	    System.out.println(date);
	   // time t = new time();
	   // String time =t.getHours()+":"+t.getMinutes()+":"+t.getSeconds();
	    System.out.println(time);
		 FileHandler.copy(source, dest);
		// System.out.println(source);
		 
	}

}
