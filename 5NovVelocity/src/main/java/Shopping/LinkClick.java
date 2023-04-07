package Shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkClick {
	@FindBy(linkText="Sauce Labs Backpack")
	
    private WebElement Backpack;
	@FindBy(xpath="//button[contains(@id,'add-to-cart')]")
	private WebElement AddtoCart;
	
	@FindBy(id="back-to-products")
	
	private WebElement backtoproduct;
	
	public LinkClick(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void backpack() {
		Backpack.click();
	}
	public void addtocart() {
		AddtoCart.click();
	}
	public void backtoproduct1() {
		backtoproduct.click();
	}
	
	
}

