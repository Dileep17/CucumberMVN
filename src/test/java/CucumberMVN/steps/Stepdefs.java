package CucumberMVN.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

    public Stepdefs(){
        System.out.println(">>>>>>>>>>>>>>>>");
        System.out.println("This is in Stepdefs cons" + this);
        System.out.println(">>>>>>>>>>>>>>>>");
    }

    @Given("today is Sunday")
    public void today_is_Sunday() {
        System.out.format("Thread ID - %2d - from Stepdefs feature file.\n",
                Thread.currentThread().getId());
        System.out.println("today_is_Sunday");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        System.out.format("Thread ID - %2d - from Stepdefs feature file.\n",
                Thread.currentThread().getId());
        System.out.println("i_ask_whether_it_s_Friday_yet");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        System.out.format("Thread ID - %2d - from Stepdefs feature file.\n",
                Thread.currentThread().getId());
        System.out.println("i_should_be_told");
    }



}
