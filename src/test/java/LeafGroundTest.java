import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LeafGroundTest {

    WebDriver driver ;
    @BeforeMethod
  public void GetPage(){
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.leafground.com/link.xhtml");

  }

  @Test
  public  void LinkTest() {
      WebElement homeLink =driver.findElement(By.linkText("Go to Dashboard"));
      homeLink.click();
      driver.navigate().back();

      WebElement BrokenLink =driver.findElement(By.linkText("Broken?"));
      BrokenLink.click();

      String title=driver.getTitle();
      if(title.contains("404")){
          System.out.println("link is broken");
      }else {
          System.out.println("not broken");
      }
      List<WebElement> countLink = driver.findElements(By.tagName("a"));
      int allCount = countLink.size();
      System.out.println("Total number of links on the page: " + allCount);
  }

  }

