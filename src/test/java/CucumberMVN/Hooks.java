package CucumberMVN;

import CucumberMVN.driver.Driver;
import CucumberMVN.driver.ReportWriter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    Driver driver;

    public Hooks(Driver driver){
        this.driver = driver;
    }

    @Before
    public void setup(Scenario scenario){
        scenario.write("This is in Hooks for scenario " + scenario + ". Before" + this.driver);
    }

    @After
    public void tearDown(Scenario scenario){
        scenario.write("This is in Hooks for scenario " + scenario + ". After" + this.driver);
        driver.quitWebDriver();
    }
}




