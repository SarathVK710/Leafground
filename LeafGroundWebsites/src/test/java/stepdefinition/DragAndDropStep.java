package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.TestContext;

public class DragAndDropStep {
    TestContext context;
    public DragAndDropStep(TestContext context){
        this.context = context;
    }
    @Given("select the broswer option")
    public void selectBroswerOption(){
        context.pageObjectManager.getSidebarPage().selectBrowserButton();
    }
    @When("select Drag option")
    public void selectDragOption() {
        context.pageObjectManager.getDragPage().selectTheDragOption();
    }

    @Then("user drag and drop the droppable")
    public void userDragAndDropTheDroppable() {
       context.pageObjectManager.getDragPage().userDragAndDropTheOptions();
    }

    @And("after drag should get the text and background colour")
    public void afterDragShouldGetTheTextAndBackgroundColour() {
        String BackgroundText = context.pageObjectManager.getDragPage().getTheTextAfterDrop();
        Assert.assertEquals("Dropped!", BackgroundText);

       String BackgroundColourCode = context.pageObjectManager.getDragPage().getTheColourAfterDrop();
        Assert.assertEquals("rgba(0, 113, 188, 1)",BackgroundColourCode);
    }
}