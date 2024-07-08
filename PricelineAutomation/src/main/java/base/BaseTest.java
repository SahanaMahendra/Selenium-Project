package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class BaseTest {
 public static WebDriver driver;
 public static Properties prop;

 public BaseTest(){
  try {
   prop = new Properties();
   FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
           + "/qa/config/config.properties");
   prop.load(ip);
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }
 }


 public static void initialization()
 {
  String browserName = prop.getProperty("browser");
   if(browserName.equals("chrome")){
    System.setProperty("webdriver.chrome.driver", "/Users/sahanam/Desktop/chromedriver-mac-arm64/chromedriver");
    driver = new ChromeDriver();
   }
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.get(prop.getProperty("https://www.priceline.com/"));
 }
}
