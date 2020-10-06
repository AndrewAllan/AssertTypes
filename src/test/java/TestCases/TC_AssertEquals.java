package TestCases;

import Browsers.Chrome;
import Utils.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TC_AssertEquals extends Base {
    @Before
    public void beforeTest(){
        Chrome chrome = new Chrome();
        driver = chrome.StartChrome("http://scrapyard4mycar.com/");
    }

    @Test
    public void Test(){

        //asserts that the text feild with the name q is pressent on screen
        assertEquals("Scrap Yard 4 My Car",driver.findElement(By.xpath("//*[@id=\"text\"]/h1")).getText());
    }

    @After
    public void AfterTest(){
        driver.close();
    }
}
