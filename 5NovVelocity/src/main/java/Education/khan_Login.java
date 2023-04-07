package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class khan_Login{
	
	@FindBy(xpath="//a[@id='login-or-signup']")
	private WebElement login;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	public khan_Login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void login() {
		login.click();
	}
	public void username() {
		username.sendKeys("rahulmadake2000@gmail.com");
	}
	public void password() {
		password.sendKeys("raje@123");
	}
	public void submit() {
		submit.click();
	
	}
	
	
	
	
	
	

}
