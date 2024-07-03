package BuildFrameWork.AutoBots;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Autobots.Class.LoginPage;
import Resources.AutoBots.BaseClass;


public class LoginValidationsTest extends BaseClass {
	public void textvalidation() {
		LoginPage lp=new LoginPage(driver);
		lp.loginpageValidation();
		
	}
	@Test
	public void gotoUrlvalidationTest () {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		String ur=driver.getCurrentUrl();
		Assert.assertEquals(ur, "https://banavaths45.github.io/selinium/home");

	}
	@Test
public void login() {
	String username="cgtacademy";
	String password="cgt@123";
	LoginPage lp=new LoginPage(driver);
	lp.getLogin(username, password);
	driver.switchTo().alert().accept();
}
	@Test
public void invalidusername() {
	String username="cgta";
	String password="cgt@123";
	LoginPage lp=new LoginPage(driver);
	lp.getLogin(username, password);
	driver.switchTo().alert().accept();
	}
	@Test
public void invalidpassword() {
	String username="cgtacademy";
	String password="cgt";
	LoginPage lp=new LoginPage(driver);
	lp.getLogin(username, password);
	driver.switchTo().alert().accept();
	}
}
