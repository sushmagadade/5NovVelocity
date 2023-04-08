package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Date_tim.Time;


public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		//File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Date d =new Date();
		 String str = d.toString().replace(":", "_").replace(" ", "_").replace("PST", "");
		  Time t =new Time();
		  
		  for(int i=0;i<=5;i++) {
			 
		 
		   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		 File dest = new File( "C:\\Screenshot\\"+"Screenshott_"+i+str+".jpg");
		 //File dest = new File( "C:\\Screenshot\\"+"Screenshott_"+i+Time+".jpg");
		 FileHandler.copy(src, dest);
		 System.out.println(str);
		 
	}

}
}