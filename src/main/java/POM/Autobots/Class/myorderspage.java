package POM.Autobots.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myorderspage {
	WebDriver driver;
	public myorderspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//h1[text()='My Orders']")
	WebElement myorders;
	@FindBy(xpath="//a[text()='GOTO GreenCart']")
	WebElement gotogreenkart;
	
	
	public String myorder() {
		String text=myorders.getText();
		return text;
	}
	
	public String gotogreenkart() {
	String gk=gotogreenkart.getText();
	return gk;

	}
	public void greenkart() {
		gotogreenkart.click();
	}
}
