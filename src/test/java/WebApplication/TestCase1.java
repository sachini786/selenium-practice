package WebApplication;

import org.example.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestCase1 {
    WebDriver driver;
    @BeforeMethod
    public  void  OpenBrowser(){
        driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");

    }
    @Test
    public  void TC001(){
     HomePage homepage=new HomePage(driver);
     homepage.SelectRegisterMenu();
    }
}
