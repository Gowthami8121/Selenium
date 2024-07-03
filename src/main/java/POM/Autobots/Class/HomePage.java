package POM.Autobots.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//div/p")
WebElement Titlename;

@FindBy(xpath="//div/p/following::h1")
WebElement Titlewelcome;

@FindBy(xpath="//a[text()='GreenKart']")
WebElement Greenkart;

public String Titlenamevalidation() {
	String name=Titlename.getText();
	return name;
}
public String Titlewelcomevalidation() {
	String name1=Titlewelcome.getText();
	return name1;
}
public void Greenkartvalidation() {
	 Greenkart.click();
	
}
}


