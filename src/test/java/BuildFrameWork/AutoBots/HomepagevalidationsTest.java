package BuildFrameWork.AutoBots;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Autobots.Class.HomePage;
import POM.Autobots.Class.LoginPage;
import POM.Autobots.Class.Textvalidations;
import Resources.AutoBots.BaseClass;

public class HomepagevalidationsTest extends BaseClass {
	@Test
	public void urlvalidationstest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://banavaths45.github.io/selinium/home");
	
	}
	
	@Test
	public void titlevalidationstest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		String Title=driver.getTitle();
		Assert.assertEquals(Title, "React App");
	
	}
	@Test
	public void cgtlogovalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		Textvalidations tv=new Textvalidations(driver);
	String logo=tv.cgtlogovalidation();
		Assert.assertEquals(logo, "CGT");

	}
	@Test
	public void Titlenamevalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		String tn=hp.Titlenamevalidation();
		Assert.assertEquals(tn, "I'AM ANURAG");
	}
	@Test
	public void Titlewelcomvalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		String tw=hp.Titlewelcomevalidation();
		Assert.assertEquals(tw, "WELCOME TO JAVA SELENIUM COURSE");
	}
	
	@Test
	public void Greenkartvalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Assert.fail();
		
	}
}
