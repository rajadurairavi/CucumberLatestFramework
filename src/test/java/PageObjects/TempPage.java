package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunctions.BaseTest;

public class TempPage {
	
	
	public static WebDriver driver;
	
	
	// Constructor for WebDriver
	
	public TempPage() {
		
		
		this.driver=BaseTest.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	// Page Locators

	@FindBy(xpath = "//textarea[@name='q']")
	public static WebElement GoogleSearchBox;
	
	// Page Actions
	
	public void enterTextInSearchBox(String SearchText) {
		GoogleSearchBox.sendKeys(SearchText+Keys.ENTER);
	}
	
	
}
