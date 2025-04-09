import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class ExplicitWait {
    WebDriver driver  ;
    @Test
    public void ExplicitWaitBrowserOpen(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/waits.xhtml");

        }
        @Test
    public void ExplicitWaitTest1(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("j_idt87:j_idt89")).click();
        By newLocator=By.xpath("//button[@id='j_idt87:j_idt90']");
        WebElement newButtonElemnt = wait.until(ExpectedConditions.visibilityOfElementLocated(newLocator));

        String getTextButton=newButtonElemnt.getText();
        System.out.println("Text is  " +getTextButton);
        }
}
