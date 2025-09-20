package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpiceGetPage {

    WebDriver driver;

    public SpiceGetPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFormLocation(String FromLocation){
        driver.findElement(By.id("css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73")).click();
       String highlighted = driver.findElement(By.id("css-1dbjc4n r-1ewfge1 r-ms8t9i r-1phboty r-1loqt21 r-6gpygo r-lqms97 r-1qhn6m8 r-1otgn73")).getText();

       driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/child::div/child::div[@class='css-1dbjc4n']/child::div/child::div[text()='" + FromLocation +"']")).click();

    }



}
