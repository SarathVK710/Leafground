package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.TestContext;

import javax.annotation.WillNotClose;

public class WindowHandleStep {
    TestContext context;
    public WindowHandleStep(TestContext context){
        this.context = context;
    }
    @When("select the window option on the menu")
    public void windowOptionOnTheMenu() {
        context.pageObjectManager.getSidebarPage().selectBrowserButton().selectWindowOnTheMenuBar();
    }

    @Then("click the open button and Confirm new Window Opens")
    public void confirmNewWindowOpens() {
        context.pageObjectManager.getWindow().clickTheNewWindowOpensButton();
    }

    @And("click the open multiple button and Find the number of opened tabs")
    public void findTheNumberOfOpenedTabs() {
        context.pageObjectManager.getWindow().clickTheOpenMultipleButtonAndFindTheNumberOfOpenedTabs();
    }
}
