package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitPage {

    WebDriver driver;
    public WaitPage(WebDriver driver){
        this.driver = driver;
    }

    public String clickOnTheVisibilitySectionAndOnceVisibileGetTheText(){

        driver.findElement(By.id("j_idt87:j_idt89")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("j_idt87:j_idt90")));
        String iamhereText = driver.findElement(By.id("j_idt87:j_idt90")).getText();
        return iamhereText;
        }
    public String clickOnTheInvisibilitySectionAndConfirmButtonIsHide(){
        String buttunText;
        try {
            buttunText = driver.findElement(By.id("j_idt87:j_idt93")).getText();
        }catch (NoSuchElementException a){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.pollingEvery(Duration.ofSeconds(1));
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("j_idt87:j_idt93")));
            buttunText = driver.findElement(By.id("j_idt87:j_idt93")).getText();
        }
        return buttunText;
        }
}
