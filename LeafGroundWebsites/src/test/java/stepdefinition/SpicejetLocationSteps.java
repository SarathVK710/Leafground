package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import utility.TestContext;

public class SpicejetLocationSteps {
    TestContext context;
    public SpicejetLocationSteps(TestContext context){
        this.context = context;
    }

    @Given("user select the From Location {string}")
    public void userSelectTheFromLocation(String FromLocation) {
        context.pageObjectManager.GetsSpiceGetPage().selectFormLocation(FromLocation);
    }

    @When("user select the To Location {string}")
    public void userSelectTheToLocation(String ToLocation) {
    }

    @And("user select the Departure Date {string}")
    public void userSelectTheDepartureDate(String DepartureDate) {
    }

    @Then("user select the Return Date {string}")
    public void userSelectTheReturnDate(String ReturnDate) {
    }

    @And("Click Search button")
    public void clickSearchButton() {
    }
}
