package Resources.AutoBots;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Autobots.Class.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	
	
	public WebDriver browserinvoke() throws IOException {
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\MYPC\\eclipse-workspace\\AutoBots\\src\\main\\java\\Globalinfo\\Autobots\\Globalparameters.Properties");
		pro.load(fis);
		String browser = pro.getProperty("browser");
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
		}
		if(browser.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
@BeforeMethod
public void getLogin() throws IOException {
	driver=browserinvoke();
	LoginPage obj = new LoginPage(driver);
	obj.gotoUrl();
}
@AfterMethod
public void teardown() {
	driver.close();
}
public String getScreenshot(String testcasename,WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src =ts.getScreenshotAs(OutputType.FILE);
	File file = new File(System.getProperty("user.dir")+"//Reports//"+testcasename+".png");
	FileUtils.copyFile(src, file);
	return System.getProperty("user.dir")+"//Reports//"+testcasename+".png";
	
	
}

}
