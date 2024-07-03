package BuildFrameWork.AutoBots;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataDriven.Autobots.checkoutpage;
import POM.Autobots.Class.HomePage;
import POM.Autobots.Class.Itemspage;
import POM.Autobots.Class.LoginPage;
import POM.Autobots.Class.myorderspage;
import Resources.AutoBots.BaseClass;

public class myorderstestvalidation extends BaseClass{
	@Test
	public void urlvalidationstest() {
		LoginPage lp=new LoginPage(driver);
		lp.getLogin("cgtacademy", "cgt@123");
		driver.switchTo().alert().accept();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://banavaths45.github.io/selinium/home");

}
	@Test
	public void myordersvalidation() throws InterruptedException {
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
		checkoutpage page=new checkoutpage(driver);
		page.promocode("gowthami");
		page.apply();
		Thread.sleep(2000);
		page.placeorder();
		page.closebutton();
		myorderspage pg=new myorderspage(driver);
		String order=pg.myorder();
		Assert.assertEquals(order, "My Orders");
	}
	@Test
	public void gotogreenkartvalidationTest() throws InterruptedException {
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
		checkoutpage page=new checkoutpage(driver);
		page.promocode("gowthami");
		page.apply();
		Thread.sleep(2000);
		page.placeorder();
		page.closebutton();
		myorderspage pg=new myorderspage(driver);
		String order=pg.myorder();
		String got=pg.gotogreenkart();
		Assert.assertEquals(got, "GOTO GreenCart");
	}
	@Test
	public void greenkartbuttonvalidationtest() throws InterruptedException {
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
		checkoutpage page=new checkoutpage(driver);
		page.promocode("gowthami");
		page.apply();
		Thread.sleep(2000);
		page.placeorder();
		page.closebutton();
		myorderspage pg=new myorderspage(driver);
		String order=pg.myorder();
		String got=pg.gotogreenkart();
		pg.gotogreenkart();
	}
	
}