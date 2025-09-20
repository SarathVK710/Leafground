package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SidebarPage {

    WebDriver driver;

    public SidebarPage(WebDriver driver){
        this.driver = driver;
    }

    public SidebarPage selectBrowserButton(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")));
        return this;
    }
    public void selectAlertOption(){
        driver.findElement(By.xpath("//i[@class='pi pi-fw pi-clone layout-menuitem-icon']")).click();
    }
    public void selectTheTableOptionOnTheSidebar(){
        driver.findElement(By.id("menuform:j_idt41")).click();
    }
    public void selectMenuTableOption(){
        driver.findElement(By.id("menuform:m_table")).click();
    }
    public void selectElementOnTheSliderBar(){
        driver.findElement(By.id("menuform:j_idt40")).click();
    }
    public void selectWaitOnTheMenuBar(){
        driver.findElement(By.id("menuform:m_wait")).click();
    }
    public void selectWindowOnTheMenuBar(){
        driver.findElement(By.id("menuform:m_window")).click();
    }
}