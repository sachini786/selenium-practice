import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWait {
    WebDriver driver;
   @BeforeMethod
    public  void  OpenBrowser(){
        driver=new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.leafground.com/waits.xhtml");

    }
    @Test
    public  void  TestWait(){
       driver.findElement(By.id("j_idt87:j_idt89")).click();
       String getTextButton=driver.findElement(By.xpath("//button[@id='j_idt87:j_idt90']")).getText();
        System.out.println("Text is  " +getTextButton);
    }
    @AfterMethod
    public void CloseBrower(){
       driver.quit();
    }
}
