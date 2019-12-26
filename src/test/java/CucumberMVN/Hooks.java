package CucumberMVN;

import CucumberMVN.driver.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    Driver driver;

    public Hooks(Driver driver){
        this.driver = driver;
    }

    @Before
    public void setup(){
        System.out.println(">>>>>>>>>>>>>>>>");
        System.out.println("This is in Hooks cons" + this.driver);
        System.out.println(">>>>>>>>>>>>>>>>");
    }

    @After
    public void tearDown(){
        driver.quitWebDriver();
    }
}




