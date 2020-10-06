package TestCases;

import Browsers.Chrome;
import Utils.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class TC_AssertNull extends Base {
    @Before
    public void beforeTest(){
    //    Chrome chrome = new Chrome();
      //  driver = chrome.StartChrome("https://www.google.com/");
    }

    @Test
    public void Test(){
        //asserts that no feild with the name q is currently selected
        ArrayList<String> emptyList = new ArrayList<String>();
        emptyList = null;
        assertNull("checking list is null",emptyList);
    }

    @After
    public void AfterTest(){
        //driver.close();
    }
}
