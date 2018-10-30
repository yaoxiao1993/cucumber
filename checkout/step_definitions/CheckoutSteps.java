package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;
import static org.junit.Assert.*;

public class CheckoutSteps{
	int bananaPrice = 0;
	
	@Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
		bananaPrice = price;
        //throw new PendingException();
    }
	
	Checkout checkout;
	
	@When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
		checkout = new Checkout();
		checkout.add(itemCount, bananaPrice);
		
    }
	
	@Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
		assertEquals(total, checkout.total());
    }

}