import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandle {
    WebDriver driver;
    @BeforeMethod
    public  void  OpenBrowser(){
        driver=new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");

    }
    @Test
    public void windowhaldle2(){
        String parentWindow =driver.getWindowHandle();
        WebElement clickElement=driver.findElement(By.id("j_idt88:new"));
        clickElement.click();
      Set<String>NewWindow=driver.getWindowHandles();
        for (String SwitchWindow:NewWindow){
            if (!SwitchWindow.equals( parentWindow)){
               driver.switchTo().window(SwitchWindow);
                System.out.println(driver.getTitle());
            }
        }
        driver.close();
    driver.switchTo().window(parentWindow);

    }
//    @Test
//    public void WindowTest1() throws InterruptedException {
//        String oldWindow=driver.getWindowHandle();
//        System.out.println("old window is  " +oldWindow);
//      WebElement button= driver.findElement(By.id("j_idt88:new"));
//      button.click();
//      Thread.sleep(3000);
//
//
//      Set<String> handles=driver.getWindowHandles();
//        System.out.println("get size of windows "+ handles.size());
//        for(String newWindow:handles){
//            System.out.println(newWindow);
//            driver.switchTo().window(newWindow);
//            System.out.println("page title is " +driver.getTitle());
//        }
//        driver.close();
//        driver.switchTo().window(oldWindow);
//        WebElement findButton =driver.findElement(By.id("j_idt88:new"));
//       String buttonVisibility = String.valueOf(findButton.isDisplayed());
//        System.out.println("button is visible " +buttonVisibility);
//
//    }
//    @Test
//    public void NumberOfTab(){
//        WebElement Tab=driver.findElement(By.id("j_idt88:j_idt91"));
//        Tab.click();
//        Set<String>NumTab=driver.getWindowHandles();
//        System.out.println("number of tabs are "+NumTab.size());
//
//    }
//    @Test
//public void CloseWindow(){
//        WebElement CloseWindow=driver.findElement(By.id("j_idt88:j_idt93"));
//        CloseWindow.click();
//
//        Set<String>newWindowsHandle=driver.getWindowHandles();
//        for (String allWindows:newWindowsHandle){
//            if (!allWindows.equals(allWindows)){
//                driver.switchTo().window(allWindows);
//                driver.close();
//            }
//        }
//}


}
