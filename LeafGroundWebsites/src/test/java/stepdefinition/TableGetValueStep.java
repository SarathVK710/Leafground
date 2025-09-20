package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.junit.Assert;
import utility.TestContext;

import java.util.HashMap;
import java.util.Map;

public class TableGetValueStep {

    TestContext context;
    public TableGetValueStep(TestContext context){
        this.context = context;
    }

    @Given("select the table option")
    public void selectTable(){
        context.pageObjectManager.getSidebarPage().selectTheTableOptionOnTheSidebar();
    }
    @When("click table option")
    public void clickTableOption() {
        context.pageObjectManager.getSidebarPage().selectMenuTableOption();
    }

    @Then("extract the name on the Customer Analytics Table")
    public void extractNameOnCustomerAnalyticsTable() {
        context.pageObjectManager.getTablePage().extractTheNameOnTheCustomerAnalyticsTable();
    }

    @And("extract the country on the Customer Analytics Table")
    public void extractTheCountryOnTheCustomerAnalyticsTable() {
        context.pageObjectManager.getTablePage().extractTheCountryOnTheCustomerAnalyticsTable();
    }

    @Then("Validate the customer name and customer country")
    public void validateTheCustomerNameAndCustomerCountry() {
        context.pageObjectManager.getTablePage().validateTheCustomerNameAndCountry();
    }

}
