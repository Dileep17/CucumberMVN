package CucumberMVN.steps;

import CucumberMVN.driver.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class StoreStepTwoDefs{

    private TestContext context;
    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    public StoreStepTwoDefs(TestContext context){
        this.context = context;
        System.out.println("In StoreStepDefs const. inject TestContext = " + context + ". In thread = " + Thread.currentThread().getId());
    }

    @Then("^value stored should still be (.*?)$")
    public void storedValueShouldBePresent(int expectedValue){
        scenario.write("In storedValueShouldBePresent. inject TestContext = " + context + ". In thread = " + Thread.currentThread().getId());
        Assert.assertEquals(expectedValue, context.getI());
    }
}
