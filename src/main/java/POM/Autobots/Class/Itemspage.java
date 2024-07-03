package POM.Autobots.Class;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itemspage {
	WebDriver driver;
	
	public Itemspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//h1[text()='CGT']")
          WebElement textlogo;

@FindBy(xpath="//div[@class='logo']")
WebElement greenkartlogo;

@FindBy(xpath="//input[@type='search']")
WebElement search;

@FindBy(xpath="//button[@class='btn btn-success p-2 searchbtn']")
WebElement searchbutton;

@FindBy(xpath="//a[@aria-current='page']")
WebElement greenkartpage;

@FindBy(xpath="//div[@class='shopping-bag']")
WebElement shoppingbag;

@FindBy(xpath="//p[@class='cart']")
WebElement emptycart;


@FindBy(xpath="//div/h6")
List<WebElement> itemNames;


@FindBy(xpath="//button[@class='cartbutton']")
List<WebElement> addtocart;


@FindBy(xpath="//button[@class='proceed-btn']")
WebElement proceedbutton;

public String textlogovalidation() {
	String tl=textlogo.getText();
	return tl;
}
public String greenkartlogovalidation() {
	String green=greenkartlogo.getText();
	return green;
}
public void searchvalidation(String ca) {
	search.sendKeys(ca);	
}
public void searchbuttonvalidation() {
	searchbutton.click();
}
public String greenkartpagevalidation() {
	String page=greenkartpage.getText();
	return page;
}
public boolean shoppingbagvalidation() {
	boolean bag=shoppingbag.isDisplayed();
	return bag;
}
public void bagvalidation() {
	shoppingbag.click();
}
public String emptycartvalidation() {
	String cart=emptycart.getText();
	return cart;
}
public void additemsvalidation() throws InterruptedException {
	List<String> productsToAdd = Arrays.asList("Brocolli","Cauliflower","Cucumber");
	
	  for (int i = 0; i < itemNames.size(); i++) {
	        String[] reqItem = itemNames.get(i).getText().split("-");
	        String itemName = reqItem[0].trim();
	        if (productsToAdd.contains(itemName)) {
	        	  addtocart.get(i).click();
	        }
	        }
	  }

public void proceedbutton() {
	proceedbutton.click();
}
}
