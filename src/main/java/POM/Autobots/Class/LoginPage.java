
package POM.Autobots.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
 WebDriver driver;

public LoginPage(WebDriver driver) {
	
	this.driver=driver;
PageFactory.initElements( driver,this);

}

@FindBy(xpath="//input[@placeholder='cgtacademy']")
WebElement username;
@FindBy(xpath="//input[@placeholder='cgt@123']")
WebElement password;
@FindBy(xpath="//button[@class='submit signInBtn']")
WebElement signin;
@FindBy(xpath="//h1[text()='Sign in']")
WebElement signIn;

public void gotoUrl() {
	driver.get("https://banavaths45.github.io/selinium/");
}
public String loginpageValidation() {
	String text =signIn.getText();
	Assert.assertEquals(text,"Sign in");
	return text;
	
}

public void getLogin(String userID,String passwords) {
	username.sendKeys(userID);
	password.sendKeys(passwords);
	signin.click();
	
}


}
