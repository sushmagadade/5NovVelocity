package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Backtoproduct {
	@FindBy(id="back-to-products")
	private WebElement backtoproduct;
	
	public Backtoproduct(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}
	 
	 public void backtoproduct1() {
		 backtoproduct.click();
	 }
	
	

}
