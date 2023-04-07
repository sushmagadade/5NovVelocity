package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkClick6 {
	@FindBy(linkText="Test.allTheThings() T-Shirt (Red)")
	private WebElement RedTshirt;
	
	@FindBy(xpath="//button[contains(@id,'add-to-cart')]")
	private WebElement AddtoCart5;
	
	public LinkClick6(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void redtshirt() {
		RedTshirt.click();
	}
	public void addtocart5() {
		AddtoCart5.click();
	}

}
