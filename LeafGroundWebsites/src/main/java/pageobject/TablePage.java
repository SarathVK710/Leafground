package pageobject;

import org.apache.poi.ss.usermodel.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ExcelSheetImport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablePage {
    WebDriver driver;
    public TablePage(WebDriver driver){
        this.driver = driver;
    }

    public List<String> extractTheNameOnTheCustomerAnalyticsTable(){
        List<String> customerName = new ArrayList<String>();
        int tableCustomerSize = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[1]")).size();
            for (int i=0; i < tableCustomerSize ; i++){
                String getCoustomerText = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[1]")).get(i).getText();
                customerName.add(getCoustomerText);
            }
            return customerName;

    }
    public List<String> extractTheCountryOnTheCustomerAnalyticsTable(){
        List<String> customerCountry = new ArrayList<String>();
        int tableCustomerCountrySize = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[2]")).size();
            for (int i=0;i<tableCustomerCountrySize; i++){
                String getCustomerCountryname = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[2]")).get(i).getText();
                customerCountry.add(getCustomerCountryname);
            }
            return customerCountry;
    }
    public void validateTheCustomerNameAndCountry(){
        Map<String,String> Validation = new HashMap<>();
        int tableCustomerCountrySize = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[2]")).size();
        for (int i=0;i<tableCustomerCountrySize; i++){
            String getCustomerCountryname = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[1]")).get(i).getText();
            String getCustomerName = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[2]")).get(i).getText();
            Validation.put(getCustomerCountryname,getCustomerName);
            System.out.println(Validation);
        }
    }
    public void selectTheSearchBarEnterValueOnTheTablepage() throws IOException {
        driver.findElement(By.id("form:j_idt89:globalFilter")).sendKeys(ExcelSheetImport.getExcelImportsheet("CountryName",0,0));
    }
    public Map<String, String> afterSearchGetTheSearchTableResults(){

        Map<String,String> results = new HashMap<String,String>();
        int resultsSize = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[1]")).size();
        for (int i=0; i<resultsSize; i++){
            String searchName = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[1]")).get(i).getText();
            String searchCountry = driver.findElements(By.xpath("//div[@id='form:j_idt89']/child::div[@class='ui-datatable-scrollable-body']/child::table/child::tbody/child::tr/child::td[2]")).get(i).getText();
            results.put(searchName,searchCountry);
        }return results;
    }
}