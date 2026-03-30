package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserBase {

  public  WebDriver driver;

    public WebDriver getDriver() throws IOException {

        if (driver == null) {

            Properties properties = new Properties();
            File file = new File("src/main/resources/configuration/framewrokconfiguration.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);

            switch (properties.getProperty("browser")) {
                case "chrome":
                    //driver = new ChromeDriver();
                    WebDriverManager.chromedriver().setup();

                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless=new");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--window-size=1920,1080");

                    driver = new ChromeDriver(options);
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new InvalidArgumentException("Enter the currect browser name");
            }

            driver.get(properties.getProperty("testenvironment"));
  //          driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
       return driver;
    }
}




//        if (properties.getProperty("browser").equalsIgnoreCase("chrome")){
//             driver = new ChromeDriver();
//        }else if (properties.getProperty("browser").equalsIgnoreCase("edge")) {
//             driver = new EdgeDriver();
//        }else if (properties.getProperty("browser").equalsIgnoreCase("safari")){
//             driver = new SafariDriver();
//        }else {
//            throw new InvalidArgumentException("Enter your correct browser name");
//        }