package Education;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Progress {
	@FindBy(xpath="//a[@class='_158ir6wt']")
	private WebElement Progress;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement Last7days;
	

	@FindBy(xpath="(//div[@role='option'])[3]")
	private WebElement Last30days;
	

	@FindBy(xpath="(//button[@class='_14wjxigb'])[2]")
	private WebElement AllContent;
	

	@FindBy(xpath="(//div[@class='_5ofz56r'])[2]")
	private WebElement CourceMastarygoal;
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement Allactivities;
	
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement unittest;

	
	public Progress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	 
	}
	public void Progress() {
		Progress.click();
	}	
	public void Last7days() {
		Last7days.click();
	}
	public void Last30days() {
		Last30days.click();
	}
	public void AllContent() {
		AllContent.click();
	}
	public void CourceMastarygoal() {
		CourceMastarygoal.click();
	}
	public void Allactivities() {
		Allactivities.click();
	}
	public void unittest() {
		unittest.click();
	}

	
	
	}

