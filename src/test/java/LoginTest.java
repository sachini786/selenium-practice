import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;

public class LoginTest {
WebDriver driver;
    @BeforeMethod
public void OpenBrowser() {
     driver = new ChromeDriver();
        driver.get(" https://www.leafground.com/input.xhtml");
//        driver.findElement(By.id("APjFqb")).sendKeys("colombo" + Keys.ENTER);
//        driver.manage().window().maximize();

}
@Test
public void gettext(){
    WebElement getText = driver.findElement(By.xpath(" //input[@id='j_idt88:name']"));
    String Text= getText.getText();
    System.out.println("content is " +Text);


}


}
