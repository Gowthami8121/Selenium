package POM.Autobots.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	WebDriver driver;
	
	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@class='promoCode']")
	WebElement code;
	@FindBy (xpath="//*[text()='Apply']")
	WebElement apply;
	@FindBy (xpath="//button[text()='Place Order']")
	WebElement placeorder;
	@FindBy (xpath="//h4[@class='close']")
	WebElement close;

	public void promocode(String codename) {
		code.sendKeys(codename);
		
	}
	public void applycode() {
		apply.click();
		
		
		
		
	}
	public void order() {
		placeorder.click();
	}
public void close() {
	close.click();
}
}
