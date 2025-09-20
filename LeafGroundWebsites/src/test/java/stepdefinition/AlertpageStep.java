package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobject.AlertPage;
import utility.TestContext;

public class AlertpageStep {

    TestContext context;

    public AlertpageStep(TestContext context){
        this.context = context;
    }

    @Given("select the browser option")
    public void selectBroserOption(){
        context.pageObjectManager.getSidebarPage().selectBrowserButton();
    }

    @When("Alert option")
    public void alertOption() {
        context.pageObjectManager.getSidebarPage().selectAlertOption();
    }

    @Then("select Alert for Simple Dialog button")
    public void selectAlertSimpleDialogButton() {
        context.pageObjectManager.getAlertPage().selectAlertSimpleDialogbutton();
    }

    @And("click alert model OK button")
    public void clickAlertModelOKButton() {
        context.pageObjectManager.getAlertPage().selectAcceptAlertButton();
    }

    @Then("get the text")
    public void getTheText() {
        String getText = context.pageObjectManager.getAlertPage().getTextAfterAcceptSimpleDialog();
        Assert.assertEquals("You have successfully clicked an alert",getText);
    }
}