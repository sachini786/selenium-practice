import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Action2 {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser() {
        driver = new ChromeDriver();

        System.out.println();
    }
  @Test
    public void KeyBoardAction1(){
      driver.get("https://www.google.lk/");
      WebElement Typebar= driver.findElement(By.name("q"));
      Typebar.sendKeys("sachini");
      Actions actions=new Actions(driver);
      actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
      actions.keyDown(Keys.SHIFT)
              .sendKeys("writing capital sentences ")
              .keyUp(Keys.SHIFT)
              .build().perform();
    }
    @Test
    public void KeyBoardAction2(){
        driver.get(" ");
    }
}
