package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkClick3 {

	@FindBy(linkText="Sauce Labs Bolt T-Shirt")
	private WebElement BoltTshirt; 
	
	@FindBy(xpath="//button[contains(@id,'add-to-cart')]")
	private WebElement AddtoCart2;
	
	public LinkClick3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void bolttshirt() {
			BoltTshirt.click();
		}
		public void addtocart2() {
			AddtoCart2.click();
			
			}
		
		
	}
	


