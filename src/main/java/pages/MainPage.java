package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobject.PageObject;

public class MainPage extends PageObject {

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='el-button el-button--primary']")
	WebElement avboka;
	@FindBy(xpath="//button[@class='el-button el-button--default el-button--small el-button--primary ']")
	WebElement ok;
	
	public void cancelBooking() {
		avboka.click();
		ok.click();
	}
	
}
