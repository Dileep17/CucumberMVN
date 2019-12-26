package CucumberMVN.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private WebDriver driver;

    public WebDriver getWebDriver(){
        return driver;
    }

    public Driver(){
        System.setProperty("webdriver.chrome.cucumber.driver", " /Users/dileepbellamkonda/Documents/Learning/automationPracCucumber/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void quitWebDriver(){
        if( this.driver!=null )
            this.driver.quit();
    }
}
