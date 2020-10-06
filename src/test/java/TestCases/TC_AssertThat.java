package TestCases;

import Browsers.Chrome;
import Utils.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class TC_AssertThat extends Base {

    @Before
    public void beforeTest(){
        Chrome chrome = new Chrome();
        driver = chrome.StartChrome("http://scrapyard4mycar.com/");
    }

    @Test
    public void Test(){
        assertThat(driver.findElement(By.xpath("//*[@id=\"text\"]/h1")).getText(),is("Scrap Yard 4 My Car"));
        //asserts that no feild with the name q is currently selected
      //  assertFalse(driver.findElement(By.name("q")).isSelected());
    }

    @After
    public void AfterTest(){
        driver.close();
    }

}
