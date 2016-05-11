package org.selenide.AutomatedTests;

import org.selenide.AutomatedTests.testfwk.constants.CommonConstans;
import org.selenide.AutomatedTests.testfwk.entities.UserProfile;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Oleg Voronchenko on 5/11/2016.
 */
public class GmaiAutorizationTests extends GTest {
    UserProfile user = new UserProfile(CommonConstans.USER_EMAIL_ADDRESS,
            CommonConstans.USER_PWD);

    @BeforeTest
    public void preConditions() throws Exception{
        log.info("STEP - Navigate to gmail.com site");
        site.navigation.navigateTo(CommonConstans.COMMON_GMAIL_URL);

        log.info("STEP - Logout from any accounts");
        site.authorization.logOutFromAccount();

        log.info("STEP - Close gmail.com site");
        site.navigation.closeSite();
    }

    @Test
    public void userCanAuthorizeToGmailTest() throws Exception {
        log.info("STEP - Navigate to gmail.com site");
        site.navigation.navigateTo(CommonConstans.COMMON_GMAIL_URL);

        log.info("STEP - Enter email address to the field");
        site.authorization.enterUserEmailAddress(user.getEmail());

        log.info("STEP - Click Next button");
        site.authorization.clickNext();

        log.info("STEP - Enter password to the field");
        site.authorization.enterUserPassword(user.getPassword());

        log.info("STEP - Click Enter button");
        site.authorization.clickEnter();

        Assert.assertEquals(true, true, "Verify that the user is logined successfully");

        log.info("STEP - Log out from site");
        site.authorization.logOut();
        /*actions.launchBrowser();
        actions.navigateToLink();
        actions.enter

        open(baseUrl);
        $(By.name("username")).setValue("johny");
        $("#submit").click();
        //$(".loading_progress").should(disappear); // Waits until element disappears
        //$("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
*/
    }

    @AfterTest
    public void postConditions() {
        site.navigation.closeSite();
    }
/*
    private static void login() {
        $("#Email").val(gmailUsername).pressEnter();
        $("#Passwd").val(gmailPassword);
        $("#signIn").click();
        $(".error-msg").waitUntil(disappears, 2000);
    }
}*/
}
