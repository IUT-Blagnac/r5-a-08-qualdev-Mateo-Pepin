package hellocucumber;

import io.cucumber.java.be.I.Is;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private IsItFriday isItFriday = new IsItFriday();

    @Given("today is Sunday")
    public void today_is_sunday() {
        isItFriday.setToday("Sunday");
    }

    @Given("today is {string}")
    public void today_is(String string) {
        isItFriday.setToday(string);
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, IsItFriday.isItFriday(isItFriday.getToday()));
    }

}
