package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragPage {

    WebDriver driver;

    public DragPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectTheDragOption(){
        driver.findElement(By.id("menuform:m_drag")).click();
    }
    public void userDragAndDropTheOptions(){
        WebElement source = driver.findElement(By.id("form:drag"));
        WebElement target = driver.findElement(By.id("form:drop"));
        Actions action = new Actions(driver);
        action.dragAndDrop(source,target).build().perform();
    }
    public String getTheTextAfterDrop(){
        String BackgroundText = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        return BackgroundText;
    }
    public String getTheColourAfterDrop(){
        WebElement csscolour = driver.findElement(By.id("form:drop_header"));
        String BackgroundColourCode = csscolour.getCssValue("background-color");
        return BackgroundColourCode;
    }

}