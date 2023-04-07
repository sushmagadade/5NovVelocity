package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLogin {
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login;
	
	public SwagLabLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void username() {
		username.sendKeys("performance_glitch_user");
	}
	public void password() {
		password.sendKeys("secret_sauce");
	}
	public void login() {
		login.click();
	
	}

}
