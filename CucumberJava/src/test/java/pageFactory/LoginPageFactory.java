package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    WebDriver driver;
    @FindBy(id = "login.email")
    WebElement userName;
    @FindBy(id = "login.password")
    WebElement passWord;
    @FindBy(id = "logIn")
    WebElement loginBtn;

    public LoginPageFactory(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    public void enterUserName(String username){
        userName.sendKeys(username);
    }

    public void enterPassword(String password){
        passWord.sendKeys(password);
    }

    public void login(){
        loginBtn.click();
    }
}
