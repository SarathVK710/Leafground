package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.TestContext;

import java.io.IOException;
import java.time.Duration;

public class Hooks {
    TestContext context;
    public Hooks(TestContext context){
        this.context = context;
    }

    @Before
    public void beforeHooks(){
        System.out.println("Before run to hooks steps");
    }
    @After
    public void afterHooks() throws IOException {
        //context.base.getDriver().close();
    }
    @AfterStep
    public void getScreenshot(Scenario screenshot) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot)context.base.getDriver();
        byte[] getScreenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        screenshot.attach(getScreenshot,"image/png",screenshot.getName());
    }
}
