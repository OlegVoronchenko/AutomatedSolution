package org.selenide.AutomatedTests;

import org.selenide.AutomatedTests.pageobjs.GmailSite;
import org.selenide.AutomatedTests.pageobjs.base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;

/**
 * Created by Oleg Voronchenko on 5/11/2016.
 */
public class GTest extends BaseTest {
    GmailSite site = new GmailSite();
    Logger log = LoggerFactory.getLogger(GTest.class);

    private static String gmailUsername = System.getProperty("gmail.username", "enter-your-gmail-username");
    private static String gmailPassword = System.getProperty("gmail.password", "enter-your-gmail-password");

    @BeforeClass
    public void openInbox() {
        //timeout = 10000;
        //baseUrl = "http://gmail.com";
        //startMaximized = false;

        waitUntilPagesIsLoaded();
    }



    protected static void waitUntilPagesIsLoaded() {
       // $(byText("Loading")).waitUntil(disappears, 20000);
    }



}
