package TestCases;

import Browsers.Chrome;
import Utils.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertFalse;


public class TC_AssertFalse extends Base {
    @Before
    public void beforeTest(){
        Chrome chrome = new Chrome();
        driver = chrome.StartChrome("https://www.google.com/");
    }

    @Test
    public void Test(){
        //asserts that no feild with the name q is currently selected
        assertFalse(driver.findElement(By.name("q")).isSelected());
    }

    @After
    public void AfterTest(){
        driver.close();
    }
}
