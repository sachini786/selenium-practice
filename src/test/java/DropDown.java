import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {

    WebDriver driver;
    @Test
    public void DropDownTest(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");

    }
    @Test
    public void DropDownTest1() throws InterruptedException {
        WebElement dropDown=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select=new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByVisibleText("Selenium");
        Thread.sleep(3000);

        List<WebElement>ListOption= select.getOptions();
        int size=ListOption.size();
        System.out.println("size is " +size);

        for (WebElement element: ListOption){
            System.out.println(element.getText());
        }

        WebElement dropDown2=driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
        dropDown2.click();

        List<WebElement> ListOption2= driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']//li"));
        for (WebElement W :ListOption2){
           String elementName= W.getText();
           if (elementName.equals("USA")){
               W.click();
               break;
           }
        }



    }
}
