import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedioCheckBox {
    WebDriver driver;
    @BeforeMethod
    public void RedioCheckBoxTest(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");
    }
@Test
    public void RedioCheckBox1 (){
    boolean ChromeSelect= driver.findElement(By.xpath("//input[@id='j_idt87:console2:0']")).isSelected();
    boolean FirFoxSelect= driver.findElement(By.xpath("//input[@id='j_idt87:console2:1']")).isSelected();
    boolean SafariSelect= driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']")).isSelected();
    boolean EdgeSelect= driver.findElement(By.xpath("//input[@id='j_idt87:console2:3']")).isSelected();

    if (ChromeSelect){
    String ChromeOptionSelected= driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).getText();
        System.out.println("redio buttton is in " +ChromeOptionSelected);
    } else if (FirFoxSelect) {
     String FirFoxOptionSelected=   driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).getText();
        System.out.println("redio buttton is in" +FirFoxOptionSelected);
    } else if (SafariSelect) {
     String SafariOptionSelected=driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
        System.out.println("redio buttton is in " +SafariOptionSelected);
    } else if (EdgeSelect) {
     String EdgeOptionSelected=driver.findElement(By.xpath("//label[@for='j_idt87:console2:3']")).getText();
        System.out.println("redio buttton is in " +EdgeOptionSelected);
    }

     WebElement MyAgeSelect= driver.findElement(By.xpath("//input[@id='j_idt87:age:0']"));
    boolean isChecked =MyAgeSelect.isSelected();
    if (!isChecked){
        driver.findElement(By.xpath("//label[@for='j_idt87:age:0']")).click();
    }

    }
}
