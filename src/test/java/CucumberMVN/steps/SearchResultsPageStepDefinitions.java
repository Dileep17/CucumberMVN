package CucumberMVN.steps;

import CucumberMVN.driver.Driver;
import CucumberMVN.pages.SearchResultsPage;
import cucumber.api.java.en.Then;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class SearchResultsPageStepDefinitions {
    SearchResultsPage searchResultsPage;
    Driver driver;

    public SearchResultsPageStepDefinitions(Driver driver){
        this.driver = driver;
        this.searchResultsPage = new SearchResultsPage(this.driver);
        System.out.println(">>>>>>>>>>>>>>>>");
        System.out.println("This is in SearchResultsPageStepDefinitions cons" + this.driver);
        System.out.println(">>>>>>>>>>>>>>>>");
    }

    @Then("I should see below products in search results")
    public void verifySearchResults(List<String> expectedSearchResults){
        List<String> actualSearchResults = this.searchResultsPage.getProducts();
        actualSearchResults = actualSearchResults.stream().filter(product -> !product.isEmpty()).collect(Collectors.toList());
        System.out.println("printing the values read from UI:" + actualSearchResults.toString());
        System.out.println("printing the values expected    :" + expectedSearchResults.toString());
        assertTrue(expectedSearchResults.containsAll(actualSearchResults));
    }
}
