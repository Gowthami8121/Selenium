package DataDriven.Autobots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utlilities.Autobots.AbstractComponents;

public class checkoutpage extends AbstractComponents {
	WebDriver driver;
	public  checkoutpage (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@class='promoCode']")
	WebElement promocode;
	@FindBy(xpath="//button[text()='Apply']")
	WebElement apply;
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeorder;
	@FindBy(xpath="//h4[@class='close']")
	WebElement close;
	
	
	public void promocode(String codename) {
		promocode.sendKeys(codename);
	}
	public void apply() {
		apply.click();
		alertmethod();
	}

	public void placeorder() throws InterruptedException {
		scrollmethod(driver);
		Thread.sleep(2000);
		placeorder.click();
	}
	public void closebutton() throws InterruptedException {
		close.click();
		Thread.sleep(2000);
	}

}
