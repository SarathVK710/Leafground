package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import utility.TestContext;

public class WaitStep {
    TestContext context;
    public WaitStep(TestContext context){
        this.context = context;
    }

    @Given("select the element option on the slider bar")
    public void selectElementOptionSliderBar(){
        context.pageObjectManager.getSidebarPage().selectElementOnTheSliderBar();
    }

    @When("select the Waits option on the menu")
    public void selectTheWaitsOptionOnTheMenu() {
        context.pageObjectManager.getSidebarPage().selectWaitOnTheMenuBar();
    }

    @Then("click on the visibility section and once visibile get the text")
    public void clickVisibilitySectionGetTheText() {
        String getText = context.pageObjectManager.WaitPage().clickOnTheVisibilitySectionAndOnceVisibileGetTheText();
        Assert.assertEquals("I am here",getText);
    }

    @And("click on the invisibility section and confirm button is hide")
    public void clickInvisibilitySectionButtonIsHide() {
        String getText = context.pageObjectManager.WaitPage().clickOnTheInvisibilitySectionAndConfirmButtonIsHide();
        Assert.assertEquals("I am about to hide",getText);
    }
}
