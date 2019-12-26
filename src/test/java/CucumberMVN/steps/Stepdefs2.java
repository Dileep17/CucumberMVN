package CucumberMVN.steps;

import cucumber.api.java.en.Given;

public class Stepdefs2 {

    public Stepdefs2(){
        System.out.println(">>>>>>>>>>>>>>>>");
        System.out.println("This is in Stepdefs cons" + this);
        System.out.println(">>>>>>>>>>>>>>>>");
    }

    @Given("today is Monday")
    public void today_is_Monday() {
        System.out.format("Thread ID - %2d - from Stepdefs2 feature file.\n",
                Thread.currentThread().getId());
        System.out.println("today_is_Monday");
    }

}
