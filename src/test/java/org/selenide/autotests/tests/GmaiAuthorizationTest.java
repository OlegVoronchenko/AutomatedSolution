package org.selenide.autotests.tests;

import org.selenide.autotests.testfwk.constants.CommonConstans;
import org.selenide.autotests.testfwk.entities.UserProfile;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
@Title("Gmail authorization tests.")
@Description("This set of test verify the possibility of authorization functionality.")
public class GmaiAuthorizationTest extends GTest {
    private static String gmailUsername = System.getProperty("gmail.username", "enter-your-gmail-username");
    private static String gmailPassword = System.getProperty("gmail.password", "enter-your-gmail-password");

    UserProfile user = new UserProfile(gmailUsername, gmailPassword);

    @BeforeTest
    public void preConditions() throws Exception{
        site.navigation.navigateTo(CommonConstans.COMMON_GMAIL_URL);
        site.authorization.logOutFromAccount();
        site.navigation.closeSite();
    }

    @Title("User can authorize to the gmail with valid credentials.")
    @Test
    public void userCanAuthorizeToGmailTest() throws Exception {
        log.info("STEP -> Navigate to gmail.com site.");
        site.navigation.navigateTo(CommonConstans.COMMON_GMAIL_URL);

        log.info("STEP -> Enter user email address to the address field.");
        site.authorization.enterUserEmailAddress(user.getEmail());

        Assert.assertTrue(!site.authorization.isEmailErrorMessageDisplayed(), "Verify that the " + user.getEmail()
                + " - email address is accepted and an error message isn't displayed.");

        log.info("STEP -> Enter password to the password field");
        site.authorization.enterUserPassword(user.getPassword());

        Assert.assertTrue(!site.authorization.isPasswordErrorMessageDisplayed(),
                "Verify that the user password was accepted and an error message isn't displayed.");


        log.info("STEP -> Waiting for emails loading.");
        site.authorization.waitForMailLoading();

        Assert.assertEquals(site.authorization.getUserEmailAddress(), user.getEmail(),
                "Verify that the user is authorized  the email box.");

        log.info("STEP -> Log out from the user account.");
        site.authorization.logOut();
    }

    @AfterTest
    public void postConditions() {
        log.info("STEP -> Log out from site");
        site.navigation.closeSite();
    }

}
