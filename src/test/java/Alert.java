import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert {

    WebDriver driver;
    @BeforeMethod
    public  void  OpenBrowser(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");

    }
    @Test
    public void AlerTest() throws InterruptedException {
        WebElement alert=driver.findElement(By.id("j_idt88:j_idt91"));
        alert.click();
        org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement cancleAlert=driver.findElement(By.id("j_idt88:j_idt93"));
        cancleAlert.click();
        org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert2.dismiss(); //Cancle

        WebElement sendkeyAltert=driver.findElement(By.id("j_idt88:j_idt104"));
        sendkeyAltert.click();
        org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
        String getText=  alert3.getText();
        System.out.println("Text is " +getText);
        alert3.sendKeys("i am sachini");
        Thread.sleep(3000);
        alert3.accept();
    }
}

