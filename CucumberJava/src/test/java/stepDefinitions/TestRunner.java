package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "stepDefinitions",
        monochrome = true,
        plugin = {"pretty", "json:target/JSONReports/report.json"}
)
public class TestRunner {
}
