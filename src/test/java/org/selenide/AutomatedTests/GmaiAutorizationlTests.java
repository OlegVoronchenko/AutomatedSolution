package org.selenide.AutomatedTests;

import org.openqa.selenium.By;
import org.selenide.AutomatedTests.GoogleTest.GoogleTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class GmaiAutorizationlTests extends GoogleTest {
    BrowserActions actions = new BrowserActions();


    @Test
    public void userCanAuthorizeToGmailTest() throws Exception {
        /*actions.launchBrowser();
        actions.navigateToLink();

        actions.enter*/

        
        open(baseUrl);

        $(By.name("username")).setValue("johny");
        $("#submit").click();
        //$(".loading_progress").should(disappear); // Waits until element disappears
        //$("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text

    }


    private static String gmailUsername = System.getProperty("gmail.username", "enter-your-gmail-username");
    private static String gmailPassword = System.getProperty("gmail.password", "enter-your-gmail-password");

    @BeforeClass
    public static void openInbox() {
        timeout = 10000;
        baseUrl = "http://gmail.com";
        startMaximized = false;

        open("/");
        login();
        waitUntilPagesIsLoaded();
    }

    protected static void waitUntilPagesIsLoaded() {
        $(byText("Loading")).waitUntil(disappears, 20000);
    }

    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

    private static void login() {
        $("#Email").val(gmailUsername).pressEnter();
        $("#Passwd").val(gmailPassword);
        $("#signIn").click();
        $(".error-msg").waitUntil(disappears, 2000);
    }
}
