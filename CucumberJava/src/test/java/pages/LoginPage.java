package pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
     By userName =By.id(("login.email"));
     By passWord=By.id(("login.password"));
     By loginBtn=By.id("logIn");

     public LoginPage(WebDriver driver){
         this.driver=driver;
     }

     public void enterUserName(String username){
         driver.findElement(userName).sendKeys(username);
     }

    public void enterPassword(String password){
        driver.findElement(passWord).sendKeys(password);
    }

    public void login(){
        driver.findElement(loginBtn).click();
    }
}
