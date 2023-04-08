package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize webpage
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");//open url
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//wait
		
		//find source and target WebElement
		
		WebElement source = driver.findElement(By.xpath("//li[@id='node18']"));//Rome
		WebElement target = driver.findElement(By.xpath("//p[text()='Italy']"));//italy
		
		Actions act = new Actions(driver);
		//dragAndDrop(sourceElement,WebElement)
		act.dragAndDrop(source, target).perform();
		
	

	}

}
