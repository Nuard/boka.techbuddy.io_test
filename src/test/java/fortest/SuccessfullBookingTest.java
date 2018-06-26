package fortest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BookingPage;
import pages.SuccessfulBookingPage;
import util.TestBase;

/*
 Step 1: Navigate to page "https://boka.techbuddy.io/" 
 Step 2: Enter username
 Step 3: Enter password
 Step 4: BookingPage is present
 Step 5: Select reservation data on BookingPage
 Step 6: Submit Reservation data
 Step 7: Verify that "Successfull Booking" Page is present */

public class SuccessfullBookingTest extends TestBase {

	final String typetext ="text";
	@Test
	public void validateSuccessfullBookingTest() {
		
		BookingPage booking = new BookingPage(driver);
		
		SuccessfulBookingPage success = booking.makeReservation(typetext);
		
//		Assert.assertTrue(success.isElementPresent(SuccessfulBookingPage.SuccessfulBookingPageXpath));
		
	}
}
