package CucumberMVN.steps;

import CucumberMVN.driver.Driver;
import CucumberMVN.pages.SearchResultsPage;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class SearchResultsPageStepDefinitions{
    SearchResultsPage searchResultsPage;
    Driver driver;
    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    public SearchResultsPageStepDefinitions(Driver driver){
        this.driver = driver;
        this.searchResultsPage = new SearchResultsPage(this.driver);
//        scenario.write("This is in SearchResultsPageStepDefinitions cons" + this.driver);
    }

    @Then("I should see below products in search results")
    public void verifySearchResults(List<String> expectedSearchResults){
        List<String> actualSearchResults = this.searchResultsPage.getProducts();
        actualSearchResults = actualSearchResults.stream().filter(product -> !product.isEmpty()).collect(Collectors.toList());
        scenario.write("printing the values read from UI:" + actualSearchResults.toString());
        scenario.write("printing the values expected    :" + expectedSearchResults.toString());
        assertTrue(actualSearchResults.containsAll(expectedSearchResults));
    }
}
