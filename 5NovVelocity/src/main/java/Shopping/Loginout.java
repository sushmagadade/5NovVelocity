package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginout {
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement button;


	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public Loginout(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void perform_to_button() {
		button.click();
	}
	public void perform_to_logoutbutton() {
		logout.click();
	}
	
    
	
}