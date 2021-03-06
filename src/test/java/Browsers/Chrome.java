package Browsers;

import Utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome extends Base {
    public WebDriver StartChrome(String urlIn){
        System.setProperty("webdriver.chrome.driver", "src/test/java/WebDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(urlIn);
        driver.manage().window().fullscreen();
        return driver;
    }
}
