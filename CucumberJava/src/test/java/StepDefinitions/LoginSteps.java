package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver = null;
    LoginPage loginpage;

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
        String pageTitle = driver.getTitle();
        String expectedTitle = " StudentUniverse: Cheap Flights, Hotels & Rental Cars for Students";
        Assert.assertEquals(pageTitle, expectedTitle, "Page title doesn't match expected");
    }
    @Given("user is in StudentUniverse home page")
    public void user_is_in_student_universe_home_page() {
        driver.findElement(By.xpath("//a[contains(text(), 'Log in for hidden discounts')]")).click();
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginpage =new LoginPage(driver);
        loginpage.enterUserName("sahanamahendra1996@gmail.com");
        loginpage.enterPassword("Futureus$18");
    }
    @When("user clicks on login")
    public void user_clicks_on_login() {
        loginpage.login();
    }
    @Then("user is logged in to StudentUniverse Application")
    public void user_is_logged_in_to_student_universe_application() {
        System.out.println("logged in");
    }

}
