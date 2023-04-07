package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkClick2 {
	@FindBy(linkText="Sauce Labs Bike Light")
	
    private WebElement BikeLight;
	@FindBy(xpath="//button[contains(@id,'add-to-cart')]")
	private WebElement AddtoCart1;
	
	public LinkClick2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void backpack1() {
		BikeLight.click();
	}
	public void addtocart1() {
		AddtoCart1.click();
	}

}
