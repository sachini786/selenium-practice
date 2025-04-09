import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class newWebSite {
    WebDriver driver;

    @BeforeMethod
    public void OpenBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

    }
    @Test
    public void inputBox(){

   WebElement input=driver.findElement(By.id("userName"));
   input.sendKeys("sachini");
   WebElement emial=driver.findElement(By.id("userEmail"));
   emial.sendKeys("sachini@gmail.com");
   WebElement addres=driver.findElement(By.id("currentAddress"));
   addres.sendKeys("No 27\n watagoda \n harispaththuwa");
   driver.findElement(By.xpath("//button[@id='submit']")).click();

    }
    @Test
   public void checkBox(){
        driver.get("https://demoqa.com/checkbox");
        WebElement checkbox1=driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
   }

   @Test
   public  void redioButton(){
        driver.get("https://demoqa.com/radio-button");
//        driver.findElement(By.cssSelector("label[for='yesRadio']")).click();
     List  <WebElement> radioButtons=driver.findElements(By.cssSelector("label.custom-control-label"));
      for (WebElement radioButton :radioButtons){
          if(radioButton.getText().equalsIgnoreCase("Yes")){
              radioButton.click();
          }
      }
   }
   @Test
   public void Click(){
        driver.get("https://demoqa.com/buttons");
       WebElement doubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
        Actions actions=new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();

        WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();

   }
   @Test
   public void UploadAndDownload(){
        driver.get("https://demoqa.com/upload-download");
        driver.findElement(By.id("downloadButton")).click();
        WebElement uploadImage =driver.findElement(By.id("uploadFile"));
        uploadImage.sendKeys("C:\\Users\\Sachini  Fonseka\\Downloads\\sampleFile.jpeg");
   }
   @Test
   public void linkTest(){
        driver.get("https://demoqa.com/links");
        driver.findElement(By.id("simpleLink")).click();
   }
   @Test
   public void fullForm() throws InterruptedException {
       driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys("Sachini");

        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("Fonseka");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("sachinifonseka@gmail.com");
        Thread.sleep(5000);
        WebElement gender= driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        gender.click();

        WebElement number = driver.findElement(By.id("userNumber"));
        number.sendKeys("0731345678");

        driver.findElement(By.id("dateOfBirthInput")).click();
        WebElement monthDropDown=driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']"));
        Select select=new Select(monthDropDown);
        select.selectByVisibleText("April");

        WebElement yearDown=driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']"));
        Select select2=new Select(yearDown);
        select2.selectByVisibleText("2000");

        List<WebElement>days=driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__day')]"));
          for (WebElement day:days){
            if (day.getText().equals("1")){
                day.click();
                break;
            }
        }
       WebElement subjectInput = driver.findElement(By.id("subjectsInput"));
       subjectInput.sendKeys("Maths");
       subjectInput.sendKeys(Keys.ENTER);

   List<WebElement> hobbiesClick = driver.findElements(By.xpath("//label[@class='custom-control-label']"));
       for (WebElement hobby : hobbiesClick) {
      if (hobby.getText().equalsIgnoreCase("Sports")) {
              hobby.click();
               break;
           }
       }

        WebElement imageUpload=driver.findElement(By.id("uploadPicture"));
        imageUpload.sendKeys("C:\\Users\\Sachini  Fonseka\\Downloads\\sampleFile.jpeg");

        WebElement address =driver.findElement(By.id("currentAddress"));
        address.sendKeys("No 27,watagoda,harispaththuwa");

        WebElement dropdown=driver.findElement(By.id("state"));
        dropdown.sendKeys("Uttar Pradesh");
        dropdown.sendKeys((Keys.ENTER));
   }
   @Test
   public void alert(){
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
       Alert alert=driver.switchTo().alert();
       System.out.println("text is "+alert.getText());
       alert.accept();

       driver.findElement(By.id("timerAlertButton")).click();
       WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(5000));
       webDriverWait.until(ExpectedConditions.alertIsPresent());

       Alert alert1=driver.switchTo().alert();
       System.out.println("text is " +alert1.getText());
       alert1.accept();

       driver.findElement(By.id("confirmButton")).click();
       Alert alert3=driver.switchTo().alert();
       System.out.println("text is " +alert3.getText());
       alert3.accept();
       String resultText=driver.findElement(By.id("confirmResult")).getText();
       System.out.println("result is "+resultText);

       driver.findElement(By.xpath("//button[@id='promtButton']")).click();
       Alert alert4=driver.switchTo().alert();
       alert4.sendKeys("selenium Test");
       alert4.accept();
       String promptResult=driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
       System.out.println("result is "+promptResult);
   }
   @Test

   public void windowsHandle(){
        driver.get("https://demoqa.com/browser-windows");
        String curruntWindow=driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Set<String>allWindows=driver.getWindowHandles();
       for (String window :allWindows){
           if (!window.equals(curruntWindow)){
               driver.switchTo().window(window);
               System.out.println("url is "+driver.getCurrentUrl());
           }
       }

   }
}

