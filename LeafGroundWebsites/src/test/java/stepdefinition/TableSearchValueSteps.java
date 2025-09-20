package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserBase;
import utility.TestContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableSearchValueSteps {

    TestContext context;
    public TableSearchValueSteps(TestContext context){
        this.context = context;
    }
    @Given("select the table option on the slider bar")
    public void selectTableOption(){
        context.pageObjectManager.getSidebarPage().selectTheTableOptionOnTheSidebar();
    }
    @When("click table option on the menu")
    public void clickTableOption(){
        context.pageObjectManager.getSidebarPage().selectMenuTableOption();
    }
    @Then("click search option and enter the value")
    public void clickSearchOptionAndEnterTheValue() throws IOException {
        context.pageObjectManager.getTablePage().selectTheSearchBarEnterValueOnTheTablepage();
    }
    @And("extract the results")
    public void extractTheResults() {
        System.out.println("hello");
    }
}
