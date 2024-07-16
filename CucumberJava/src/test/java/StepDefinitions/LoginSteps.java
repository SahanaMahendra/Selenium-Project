package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver", "/Users/sahanam/Desktop/learn/git/Selenium-Project/CucumberJava/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("enter url")
    public void enter_url() {
        driver.navigate().to("https://www.studentuniverse.com/");
    }

    @Then("user is navigate to StudentUniverse Application")
    public void user_is_navigate_to_priceline_application() {
        System.out.println("Application launched");
    }
}
