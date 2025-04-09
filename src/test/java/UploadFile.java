import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class UploadFile {
    WebDriver driver;
        @BeforeMethod
        public  void  OpenBrowser(){
            driver=new ChromeDriver();
            driver.get("https://www.leafground.com/file.xhtml");


    }
    @Test
    public void fileDownload(){
       WebElement ClickButton= driver.findElement(By.id("j_idt93:j_idt95"));
       ClickButton.click();

        File file=new File("C:\\Users\\Sachini  Fonseka\\Downloads");
        File[] totalFile=file.listFiles();
        for (File fileStore:totalFile){
            if (fileStore.getName().equals("TestLeaf Logo.png")){
                System.out.println("file is found");
            }
        }
    }
@Test
    public void UploadFile1() throws AWTException, InterruptedException {
//            WebElement chooseButton=driver.findElement(By.id("j_idt88"));
//            chooseButton.click();
//            String data="C:\\Users\\Sachini  Fonseka\\Downloads\\download.jpg";
//        StringSelection  selection=new StringSelection(data);//file upload krna ekak then create object variable
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
//      Thread.sleep(3000);
//        Robot robot=new Robot();
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_V);
//
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);


        //second way
    String data="C:\\Users\\Sachini  Fonseka\\Downloads\\download.jpg";
    WebElement file= driver.findElement(By.id("j_idt88:j_idt89_input"));
    file.sendKeys(data);

    }
}
