package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkClick4 {
	@FindBy(linkText= "Sauce Labs Fleece Jacket") 
	private WebElement FleeceJacket;
	
	@FindBy(xpath="//button[contains(@id,'add-to-cart')]")
	private WebElement AddtoCart3;
	
	public LinkClick4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void fleecejacket() {
		FleeceJacket.click();
	}
	public void addtocart3() {
		AddtoCart3.click();
	}

}
