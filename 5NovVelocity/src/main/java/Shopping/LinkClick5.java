package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkClick5 {
	@FindBy(linkText="Sauce Labs Onesie")
	private WebElement Onesie;
	
	@FindBy(xpath="//button[contains(@id,'add-to-cart')]")
	private WebElement AddtoCart4;
	
	public LinkClick5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void onesie() {
		Onesie.click();
	}
	public void addtocart4() {
		AddtoCart4.click();
	}
		

}
