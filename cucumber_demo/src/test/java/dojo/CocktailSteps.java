package dojo;

import java.util.List;

import static org.junit.Assert.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dojo.Order;

public class CocktailSteps {
    private Order order ;

    @Given("(.*) who wants to buy a drink")
    public void x_who_wants_to_buy_a_drink(String x) {
        order = new Order();
        order.declareOwner(x);
    }

    @When("an order is declared for (.*)")
    public void an_order_is_declared_for_x(String x) {
        order.declareTarget(x);
    }

    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order() {
        //List<String> cocktails =  order.getCocktails();
        //assertEquals(0, cocktails.size());
    }

    @Then("there are {int} cocktails in the order")
    public void there_are_cocktails_in_the_order(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}