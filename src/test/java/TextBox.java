import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBox {

    WebDriver driver;
  @BeforeMethod
    public void TextBoxHandel(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");

    }

    @Test
    public void TypeName(){
    WebElement Name = driver.findElement(By.id("j_idt88:name"));
    Name.sendKeys("Sachini Fonseka");

    WebElement Country =driver.findElement(By.id("j_idt88:j_idt91"));
    Country.sendKeys("Sri Lanka");

    boolean Enable=driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("enable " +Enable);

    WebElement ClearText =driver.findElement(By.id("j_idt88:j_idt95"));
    ClearText.clear();

    WebElement GetElement =driver.findElement(By.id("j_idt88:j_idt97"));
    String GetValue=  GetElement.getAttribute("value");
        System.out.println("Value is " +GetValue);

    driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("sachini08@gmail.com" + Keys.TAB+ "that is the case ");
    }

}
