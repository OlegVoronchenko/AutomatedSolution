package org.selenide.autotests.tests;

import org.selenide.autotests.testfwk.entities.UserProfile;
import org.selenide.autotests.testfwk.constants.CommonConstans;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class GmaiAutorizationlTests extends GTest {
    private static String gmailUsername = System.getProperty("gmail.username", "enter-your-gmail-username");
    private static String gmailPassword = System.getProperty("gmail.password", "enter-your-gmail-password");

    /*UserProfile user = new UserProfile(gmailUsername,
            gmailPassword);*/
    UserProfile user = new UserProfile(CommonConstans.USER_EMAIL_ADDRESS,CommonConstans.USER_PASSWORD);

    @BeforeTest
    public void preConditions() throws Exception{
        site.navigation.navigateTo(CommonConstans.COMMON_GMAIL_URL);
        site.authorization.logOutFromAccount();
        site.navigation.closeSite();
    }

    @Test
    public void userCanAuthorizeToGmailTest() throws Exception {
        log.info("STEP -> Navigate to gmail.com site");
        site.navigation.navigateTo(CommonConstans.COMMON_GMAIL_URL);

        log.info("STEP -> Enter email address to the field");
        site.authorization.enterUserEmailAddress(user.getEmail());

        log.info("STEP -> Enter password to the field");
        site.authorization.enterUserPassword(user.getPassword());

        Assert.assertEquals(site.authorization.getUserEmailAddress(), user.getEmail(),
                "Verify that the user is logined to the email box.");

        log.info("STEP -> Log out from site");
        site.authorization.logOut();
    }

    @AfterTest
    public void postConditions() {
        site.navigation.closeSite();
    }

}
