import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Navigate {
    WebDriver driver;
    public void navigatePage() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
//        driver.get("https://www.leafground.com/input.xhtml");
        driver.navigate().to("https://www.leafground.com/alert.xhtml");
        driver.navigate().to("https://www.leafground.com/input.xhtml");




    }
}
