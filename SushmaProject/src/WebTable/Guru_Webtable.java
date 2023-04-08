package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru_Webtable {

	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get(" https://demo.guru99.com/test/table.html");
	      List<WebElement> NoOfRows = driver.findElements(By.xpath("//table[@cellspacing='1']//tr"));
	   for(int i=0;i<NoOfRows.size();i++) {
		  // System.out.println(NoOfRows.size());
		   List<WebElement> NoOfCells = driver.findElements(By.xpath("//table[@cellspacing='1']//tr["+i+"]//td"));
		   for(int j=0;j<NoOfCells.size();j++) {
			   System.out.print(NoOfCells.get(j).getText()+" ");
		   }
		   System.out.println();

		   
	   }
	   
	

	}
}


