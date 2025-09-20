package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"stepdefinition","hooks"},
        plugin = {"pretty",
                "html:target/test-output/reports.html",
                "json:target/test-output/reports.json",
                "junit:target/test-output/reports.xml"},
        tags = "@spice"
)
public class TestRunner {
}