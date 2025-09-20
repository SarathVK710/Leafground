package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectAlertSimpleDialogbutton(){
            driver.findElement(By.id("j_idt88:j_idt91")).click();
    }
    public void selectAcceptAlertButton(){
            driver.switchTo().alert().accept();
    }
    public String getTextAfterAcceptSimpleDialog(){
            return driver.findElement(By.id("simple_result")).getText();
    }

}
