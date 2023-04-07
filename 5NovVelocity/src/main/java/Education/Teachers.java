package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {
	@FindBy(xpath="(//span[text()='Teachers']")
	private WebElement Teachers;
	
	
	@FindBy(xpath="//input[@id='coach-email']") 
	private WebElement Addemail;
	

	@FindBy(xpath="//input[@type='submit']") 
	private WebElement submitteacher;
	
	public Teachers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Teachers() {
		Teachers.click();
		
	}
	public void Addemail() {
		Addemail.sendKeys("nisarbagwan2100@gmail.com");
	}
	public void submitteacher() {
		submitteacher.click();
	}
	





}
 
