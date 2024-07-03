package BuildFrameWork.AutoBots;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Autobots.Class.HomePage;
import POM.Autobots.Class.Itemspage;
import POM.Autobots.Class.LoginPage;
import Resources.AutoBots.BaseClass;

public class ItemspageValidationTest extends BaseClass{
	
	@Test
	public void urlvalidationstest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://banavaths45.github.io/selinium/home");
	}
	
	

	@Test
	public void textlogovalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		String text1=Ip.textlogovalidation();
		Assert.assertEquals(text1, "CGT");
		
	}
	

	@Test
	public void greenkartlogovalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		String gk=Ip.greenkartlogovalidation();
		Assert.assertEquals(gk, "GREENKART");
		
	}
	@Test
	public void searchvalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		Ip.searchvalidation("ca");
	
		
	}
	@Test
	public void searchbuttonvalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		Ip.searchvalidation("ca");
		Ip.searchbuttonvalidation();
	}
	
	@Test
	public void greenkartpagevalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		Ip.searchvalidation("ca");
		Ip.searchbuttonvalidation();
		String gp=Ip.greenkartpagevalidation();
		Assert.assertEquals(gp, "GreenKart");
	}
	@Test
	public void shoppingbagvalidationtest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		Ip.searchvalidation("ca");
		Ip.searchbuttonvalidation();
		boolean bag=Ip.shoppingbagvalidation();
		Assert.assertEquals(bag, true);
	}
	@Test
	public void bagvalidationtest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		Ip.searchvalidation("ca");
		Ip.searchbuttonvalidation();
		Ip.bagvalidation();
		Thread.sleep(3000);
		
	}
	@Test
	public void emptycartvalidationtest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		Ip.searchvalidation("ca");
		Ip.searchbuttonvalidation();
		Ip.bagvalidation();
		String EC=Ip.emptycartvalidation();
		Assert.assertEquals(EC, "Your cart is Empty");
	}
	
	@Test
	public void additemsvalidationtest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		//Ip.searchvalidation("ca");
		//Ip.searchbuttonvalidation();
		//Ip.bagvalidation();
		//String EC=Ip.emptycartvalidation();
	//	Assert.assertEquals(EC, "Your cart is Empty");
		String [] myList= {"Brocolli","Cauliflower","Cucumber"};
		Ip.additemsvalidation();
		

	}
	@Test
	public void proceedbuttonvalidationtest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.Greenkartvalidation();
		Itemspage Ip=new Itemspage(driver);
		String [] myList= {"Brocolli","Cauliflower","Cucumber"};
		Ip.additemsvalidation();
		Ip.bagvalidation();
		Ip.proceedbutton();
		Thread.sleep(5000);

	}
}
