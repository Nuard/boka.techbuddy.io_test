package fortest;

import org.testng.annotations.Test;
import pages.MainPage;
import util.TestBase;

/*
Step 1: Navigate to page "https://boka.techbuddy.io/" 
Step 2: Enter username
Step 3: Enter password
Step 4: Main Page with Reservation Plan is presented
Step 5: Select "avboka" button
Step 6: Select "OK" button to approve cancellation  
Step 7: Booking/subscription is cancelled */

public class BookingCancellationTest extends TestBase {
	
	@Test
	public void validateBookingCancellation() {
		
		MainPage mainpage = new MainPage(driver);
		mainpage.cancelBooking();
		
	}

}
