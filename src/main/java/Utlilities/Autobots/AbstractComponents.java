package Utlilities.Autobots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponents {
	WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		
	}
	public void scrollmethod(WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	}
	
public void alertmethod() {
	driver.switchTo().alert().accept();
	
}
public void screenShot(WebDriver driver,String filename) throws IOException {
	TakesScreenshot shot=((TakesScreenshot)driver);
	File src=shot.getScreenshotAs(OutputType.FILE);
	File destFile=new File("C://Users//MYPC//Desktop//Screenshot//"+filename+".png");
	FileUtils.copyFile(src, destFile);
	
}
}
