package CucumberMVN.steps;


import CucumberMVN.driver.Driver;
import CucumberMVN.pages.LandingPage;
import cucumber.api.java.en.*;

public class LandingPageStepDefinitions {

    Driver driver;
    LandingPage landingPage;

    public LandingPageStepDefinitions(Driver driver){
        this.driver = driver;
        this.landingPage = new LandingPage(this.driver);
        System.out.println(">>>>>>>>>>>>>>>>");
        System.out.println("This is in LandingPageStepDefinitions cons" + this.driver);
        System.out.println(">>>>>>>>>>>>>>>>");
    }

    @Given("I opened automationpractice.com")
    public void open_website(){
        this.landingPage.openAutomationPracticeWebSite();
    }

    @When("^I searched for (.*?)$")
    public void search_phrase(String phrase){
        this.landingPage.search(phrase);
    }

    @When("^I clicked on (.*?)$")
    public void  click_on(String link){
        this.landingPage.clickLink(link);
    }
}
