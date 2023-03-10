package com.fidexio.utilities;

import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static void verifyTitle(String expectedTitle){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertTrue(Driver.getDriver().getTitle().equals(expectedTitle));

    }



}
