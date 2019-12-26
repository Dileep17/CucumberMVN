package CucumberMVN.steps;

import CucumberMVN.driver.Driver;
import CucumberMVN.pages.LoginPage;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

public class LoginPageStepDefinitions {

    Driver driver;
    LoginPage loginPage;

    public LoginPageStepDefinitions(Driver driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    @Then("I should be redirected to login page")
    public void i_should_be_redirected_to_login_page(){
        assertTrue(this.loginPage.isLoginSectionDisplayed());
    }
}
