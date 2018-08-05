package testcases;
import org.testng.Assert;
import org.testng.annotations.*;

import base.DriverInstantiation;
import pageobjects.*;
import validations.Compare;

public class AddMagicKingdomTicketsToCart extends DriverInstantiation {
	
	@Test
	
	public void addMagicKingdomTickets () {
		
		//Click Parks & Tickets from main menu
		MainMenu.clickParksTickets();
		
		//Under Parks & Tickets click Magic Kingdom
		ParksTicketsSubMenu.clickMagicKingdom();
		
		//Verify Magic Kingdom text displays on the page
		Assert.assertTrue(Compare.textExists(driver, "Magic Kingdom Park"), "Magic Kingdom Park does not display on the page");
		
		//Click the Select Tickets button on the Magic Kingdom Page
		MagicKingdom.clickSelectTickets();
		
		//Select 2 days of Tickets
		Tickets.selectNumDays(2);
		
		//Select number of Adult Tickets
		Tickets.selectNumAdultTickets(2);
		
		//Select number of Child Tickets
		Tickets.selectNumChildTickets(3);
		
		//Select ticket type
		Tickets.selectTicketType("park hopper plus");
		
		//Click Continue (add tickets to cart)
		Tickets.addTicketsToCart();
		
		//Verify Cart Contents
		//Verify number of days is correct in cart
		Assert.assertTrue(Compare.textExists(driver, "2-Day"), "The number of days of tickets in the cart is incorrect");
		
		//Verify number of Adult Tickets = 2 in cart
		Assert.assertTrue(Cart.getNumAdultTix().equals("2"), "The number of adult tickets is incorrect");
		
		//Verify number of Child Tickets = 3 in cart
		Assert.assertTrue(Cart.getNumChildTix().equals("3"), "The number of child tickets is incorrect");
		
		//Verify the type of ticket is correct
		Assert.assertTrue(Compare.textExists(driver, "Park Hopper Plus Option"), "The ticket type is incorrect");
	}
	

}
