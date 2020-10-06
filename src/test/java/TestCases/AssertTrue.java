package TestCases;

import Browsers.Chrome;
import Utils.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class AssertTrue extends Base {
    @Before
    public void beforeTest(){
        Chrome chrome = new Chrome();
        driver = chrome.StartChrome("https://www.google.com/");
    }

    @Test
    public void Test(){
        //asserts that the text feild with the name q is pressent on screen
        assertTrue(driver.findElement(By.name("q")).isDisplayed());
    }

    @After
    public void AfterTest(){
        driver.close();
    }
}
