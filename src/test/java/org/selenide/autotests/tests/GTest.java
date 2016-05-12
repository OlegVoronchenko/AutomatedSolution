package org.selenide.autotests.tests;

import com.codeborne.selenide.testng.ScreenShooter;
import org.junit.Rule;
import org.selenide.autotests.pageobjs.GmailSite;
import org.selenide.autotests.pageobjs.base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Configuration.timeout;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class GTest extends BaseTest {
    public static final GmailSite site = new GmailSite();
    Logger log = LoggerFactory.getLogger(GTest.class);

    @Rule
    public ScreenShooter screenShooter = new ScreenShooter();

    @BeforeClass
    public void setUp() {
       configuration();
    }

    @AfterClass
    public static void closeUp() {

    }

    private void configuration(){
        startMaximized = false;
        timeout = 10000;
    }
}
