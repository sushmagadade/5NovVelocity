package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers1 {
	@FindBy(xpath = "//span[text()='Teachers']")
	private WebElement teacher;

	@FindBy(xpath = "//a[@role='button']")
	private WebElement enterCode;

	@FindBy(xpath = "//input[@class='_q92ef6']")
	private WebElement enteryourCode;

	@FindBy(xpath = "//button[@role='button']")
	private WebElement comfirm;

	@FindBy(xpath = "//a[@class='_1mwdd64y']")
	private WebElement back;

	public Teachers1(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void Teach() {
		teacher.click();

	}

	public void Entercode() {
		enterCode.click();

	}

	public void Enteryourcode() {
		enteryourCode.sendKeys("vel123");
	}

	public void Comfirm() {
		comfirm.click();
	}

	public void Back() {
		back.click();
	}

}
