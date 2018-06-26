package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobject.PageObject;

public class BookingPage extends PageObject {
	
	public BookingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//i[@class='el-select__caret el-input__icon el-icon-arrow-up']")
	WebElement kategori;
	@FindBy(xpath="//span[@class='el-select-category-item' and contains(text(),'Tv/Media')]")
	WebElement selecttvmedia;
	@FindBy(xpath="//textarea[@class='el-textarea__inner']")
	WebElement textarea;
	@FindBy(xpath="//div[text()='Därefter 199.5 kr/15min']/../a[@class='btn btn-lg btn-danger btn-block no-border submit-button']")
	WebElement valj;
	@FindBy (xpath="//div[@class='buttons']/div/label/span/span[@class='el-checkbox__inner']")
	WebElement checkbox;
	@FindBy(xpath="//button[@class='el-button submit-button el-button--default']")
	WebElement Boka;
	
	public SuccessfulBookingPage makeReservation(String typetext) {
		kategori.click();
		selecttvmedia.click();
		textarea.sendKeys(typetext);
		valj.click();
		checkbox.click();
		Boka.click();
		return new SuccessfulBookingPage(driver);
	}
}
