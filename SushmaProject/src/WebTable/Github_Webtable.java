package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_Webtable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> NoofRows = driver.findElements(By.xpath("//table[@id='table02']//tr"));
		System.out.println(NoofRows.size());
		for(int i=1;i<NoofRows.size();i++) {
		List<WebElement> NoofCells = driver.findElements(By.xpath("//table[@id='table02']//tr["+(i+1)+"]//td"));
		for(int j=0;j<NoofCells.size();j++) {
			System.out.print(NoofCells.get(j).getText()+" ");
		}
		System.out.println();
		}
	

	}

}
