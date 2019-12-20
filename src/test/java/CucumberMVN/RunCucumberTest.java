package CucumberMVN;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" }, features = "src/test/resources/CucumberMVN")
public class RunCucumberTest {
}
