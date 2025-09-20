package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPage {

    WebDriver driver;

    public WindowPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickTheNewWindowOpensButton(){

        driver.findElement(By.id("menuform:j_idt38")).click();
        driver.findElement(By.id("menuform:m_dropdown")).click();




    }
    public void clickTheOpenMultipleButtonAndFindTheNumberOfOpenedTabs(){
    }
}