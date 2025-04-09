import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Button {

    WebDriver driver;
    @BeforeMethod
    public  void  OpenBrowser(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");

    }
    @Test
    public void ButtonTest(){
        WebElement button = driver.findElement(By.id("j_idt88:j_idt90"));
        System.out.println(button.isDisplayed());

        WebElement button1 = driver.findElement(By.id("j_idt88:j_idt92"));
        System.out.println(button1.isEnabled());

//        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
//        String ExpectedTitle="Dashboard";
//        String ActualTitle = driver.getTitle();
//        Assert.assertEquals(ActualTitle,ExpectedTitle,"match the title");
//
//        driver.navigate().back();
//        WebElement ButtonColor=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
//         String color= ButtonColor.getCssValue("background-color");
//        System.out.println("color is "+color);
//
//        WebElement size=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
//        int height =size.getSize().getHeight();
//        int width =size.getSize().getWidth();
//        System.out.println("height is " +height+ " width is " +width);

    }


}
