import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocaterExample {
    WebDriver driver;
   @BeforeMethod
    public  void  OpenBrowser(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");

    }

    @Test
    public void buttonTest1(){
        WebElement button1=driver.findElement(By.cssSelector("button[id='j_idt88:j_idt90']"));
        button1.click();
        driver.navigate().back();

        WebElement button2=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
        button2.click();

        WebElement button3=driver.findElement(By.name("j_idt88:j_idt94"));
        button3.click();

       String url= driver.getCurrentUrl();
        System.out.println("url is " +url);

        driver.navigate().refresh();
    }
}
