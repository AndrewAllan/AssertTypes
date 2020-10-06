package TestCases;

import Browsers.Chrome;
import Utils.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class TC_AssertNotNull extends Base {
    @Before
    public void beforeTest(){

    }

    @Test
    public void Test(){
        //asserts that no feild with the name q is currently selected
        ArrayList<String> notEmptyList = new ArrayList<String>();
        notEmptyList.add("this is a string");
        assertNotNull("checking object is not null",notEmptyList);
    }

    @After
    public void AfterTest(){
        driver.close();
    }
}
