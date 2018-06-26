package pages;

import org.openqa.selenium.WebDriver;

import pageobject.PageObject;

public class SuccessfulBookingPage extends PageObject {
	
	public SuccessfulBookingPage (WebDriver driver) {
		super (driver);
	}
	
	public final static String  SuccessfulBookingPageXpath = "//img[@class='thank-you-img']']";
}
