package CucumberMVN.pages;

import CucumberMVN.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    Driver driver;

    @FindBy(id = "login_form")
    WebElement LoginSection;

    public LoginPage(Driver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver.getWebDriver(), this);
    }

    public boolean isLoginSectionDisplayed(){
        return LoginSection.isDisplayed();
    }


}
