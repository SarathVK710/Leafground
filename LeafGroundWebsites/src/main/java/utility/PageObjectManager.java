package utility;

import org.openqa.selenium.WebDriver;
import pageobject.*;

public class PageObjectManager {

    WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public AlertPage getAlertPage(){
        AlertPage alertPage = new AlertPage(driver);
        return alertPage;
    }
    public SidebarPage getSidebarPage(){
        SidebarPage sidebarpage = new SidebarPage(driver);
        return sidebarpage;
    }
    public DragPage getDragPage(){
        DragPage dragPage = new DragPage(driver);
        return dragPage;
    }
    public TablePage getTablePage(){
        TablePage tablePage = new TablePage(driver);
        return tablePage;
    }
    public WaitPage WaitPage(){
        WaitPage waitPage = new WaitPage(driver);
        return waitPage;
    }
    public WindowPage getWindow(){
        WindowPage windowPage = new WindowPage(driver);
        return windowPage;
    }
    public SpiceGetPage GetsSpiceGetPage(){
        SpiceGetPage spiceGetPage = new SpiceGetPage(driver);
        return spiceGetPage;
    }

}
