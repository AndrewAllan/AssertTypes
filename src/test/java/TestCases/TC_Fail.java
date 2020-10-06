package TestCases;

import Browsers.Chrome;
import Utils.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TC_Fail extends Base {
    @Before
    public void beforeTest(){
        Chrome chrome = new Chrome();
        driver = chrome.StartChrome("http://scrapyard4mycar.com/");
    }

    @Test
    public void Test(){
      //  fail(driver.findElement(By.xpath("//*[@id=\"text\"]/h1")).isSelected());
        if(!driver.findElement(By.xpath("//*[@id=\"text\"]/h1")).isSelected()){
            fail("title text is not selected on default");

        }
    }

    @After
    public void AfterTest(){
        driver.close();
    }
}
