package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Widding_Jwelley_Set_Page extends Base {

	public Widding_Jwelley_Set_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div//li[5]/a/div[2]/p")
	WebElement WineIsDisplayed;
	
	
	public boolean Wine_Is_Displayed() {
		 return WineIsDisplayed.isDisplayed();
	 }

}
