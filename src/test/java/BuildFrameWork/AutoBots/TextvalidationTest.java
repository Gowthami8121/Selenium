package BuildFrameWork.AutoBots;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Autobots.Class.LoginPage;
import POM.Autobots.Class.Textvalidations;
import Resources.AutoBots.BaseClass;

public class TextvalidationTest extends BaseClass{
	@Test
	public void SigninTextvalidationtest() {
		Textvalidations tv=new Textvalidations(driver);
		String text =tv.signintextValidation();
		Assert.assertEquals(text, "Sign in");
	}
	@Test
	public void remeberTextvalidationtest() {
		Textvalidations tv=new Textvalidations(driver);
		String remember =tv.Remebertextvalidation();
		Assert.assertEquals(remember, "Remember my username");
	}
	@Test
	public void Termstextvalidationtest() {
		Textvalidations tv=new Textvalidations(driver);
		String Terms=tv.Termstextvalidation();
		Assert.assertEquals(Terms, "I agree to the terms and privacy policy.");
		
		
	}
	@Test
	public void forgottextvalidationtest() {
		Textvalidations tv=new Textvalidations(driver);
		String ft=tv.forgotpasswordvalidation();
		Assert.assertEquals(ft, "Forgot your password?");	
	}
	@Test
	public void signinbuttonvalidationtest() {
		Textvalidations tv=new Textvalidations(driver);
		String sib=tv.signinbuttonvalidation();
		Assert.assertEquals(sib, "Sign In");
	}
	@Test
	public void urlvalidationtest() {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://banavaths45.github.io/selinium/");
	}
	@Test
	public void Titlevalidationtest() {
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "React App");
		
	}

}
