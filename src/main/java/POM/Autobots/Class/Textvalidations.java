package POM.Autobots.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Textvalidations {
	WebDriver driver;
	public Textvalidations(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
			}
	
	
	
	@FindBy(xpath="//h1[text()='Sign in']")
	WebElement signIn;
	
	@FindBy(xpath="//label[@for='chkboxOne']")
	WebElement RemeberText;
	
	@FindBy(xpath="//label[@for='chkboxTwo']")
	WebElement TermsText;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotpassword;

	@FindBy(xpath="//button[@class='submit signInBtn']")
	WebElement signinbutton;
	
	@FindBy(xpath="//h1[text()='CGT']")
	WebElement cgtlogo;
	
	
	
	

	public String signintextValidation() {
			String text =signIn.getText();

			return text;

	}
public String Remebertextvalidation() {
	String rtv=RemeberText.getText();
	return rtv;
}
public String Termstextvalidation() {
	String ttv=TermsText.getText();
	return ttv;
}
public String forgotpasswordvalidation() {
	String password=forgotpassword.getText();
	return password;
}
public String signinbuttonvalidation() {
	String button=signinbutton.getText();
	return button;
}
public String cgtlogovalidation() {
	String logo=cgtlogo.getText();
	return logo;
}

}