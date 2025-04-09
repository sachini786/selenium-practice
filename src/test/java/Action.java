import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Action {
    WebDriver driver;

    @BeforeMethod
    public void OpenBrowser() {
        driver = new ChromeDriver();

        System.out.println();
    }

    @Test
    public void mouseOperation() {
        driver.get("https://leafground.com/drag.xhtml");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//li[@id='menuform:j_idt37']"))).perform();

    }
    @Test
    public void DragAndDrop(){
    Actions action = new Actions(driver);
    WebElement from= driver.findElement(By.id("form:drag"));
    WebElement To=driver.findElement(By.id("form:drop"));
    action.clickAndHold(from).moveToElement(To).release(To).perform(); //First way
    action.dragAndDrop(from,To).perform(); //second way

    }
@Test
    public  void ClickItemTask(){
    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
    WebElement RightClickElement =  driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
    Actions action1 = new Actions(driver);
    action1.contextClick(RightClickElement).perform();
    WebElement EditClick= driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
    EditClick.click();
    Alert alertPop= driver.switchTo().alert();
    System.out.println("alter show as " +alertPop.getText());
    alertPop.accept();
    }
}
