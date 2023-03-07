package com.fidexio.utilities;

import org.junit.Assert;

public class BrowserUtils {

    public static void verifyTitle(String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().equals(expectedTitle));

    }
}
