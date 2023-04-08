package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableElement {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		for(int k=0;k<list.size();k++) {
			System.out.println(list.size());

        List<WebElement> Noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(k+1)+"]//td"));
        for(int i=1;i<=Noofcells.size();i++) {
       
         System.out.println(Noofcells.get(i).getText()+" ");
 
       //  https://demo.guru99.com/test/table.html

        }
	}
	}
}
