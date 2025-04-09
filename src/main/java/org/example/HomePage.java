package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
WebDriver driver;

public HomePage (WebDriver driver){
this.driver=driver;
}


By Register_Loc=By.linkText("REGISTER");
    public void SelectRegisterMenu(){
        driver.findElement(Register_Loc).click();
    }
}
