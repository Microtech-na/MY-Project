package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.Base;

public class Etsy_Landing_Page extends Base {
	
	WebDriver driver;

	public Etsy_Landing_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateURL() {
		driver.get("https://www.etsy.com/");
	}

	
	@FindBy(xpath="//span[@id='catnav-primary-link-10983']")
	WebElement hoverWeddingAndParty;
	
	@FindBy(xpath="//div//ul//span[@id='side-nav-category-link-11039']")
	WebElement hoverWeddingJwellery;
	
	@FindBy(xpath="//a[@id='catnav-l3-11047']")
	WebElement clcikJwellerySet;
	
	public void hover_Wedding_And_Party() {
		Actions action = new Actions(driver);
		action.moveToElement(hoverWeddingAndParty).build().perform();
	}
	
	public void hover_Wedding_Jwellery() {
		Actions action = new Actions(driver);
		action.moveToElement(hoverWeddingJwellery).build().perform();
	}

	
	 public void click_Jwellery_Set() {
		 clcikJwellerySet.click();
	}

}
