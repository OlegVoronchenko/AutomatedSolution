package org.selenide.autotests.pageobjs.features;

import org.selenide.autotests.pageobjs.base.BaseFeature;
import org.selenide.autotests.pageobjs.screens.EmailsPage;
import org.selenide.autotests.pageobjs.screens.LoginPage;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class AuthorizationFeature extends BaseFeature {
    LoginPage loginPage = new LoginPage();
    EmailsPage commonPage = new EmailsPage();

    /**
     * Logout from the account
     */
    public void logOutFromAccount() {
        if(isUserLogged()) { logOut(); }
    }

    /**
     * Logging out
     */
    public void logOut() {
        commonPage.clickOnUserBox();
        commonPage.clickOnSignOutButton();
    }

    /**
     * Is user logined
     * @return
     */
    public boolean isUserLogged() {
        if (loginPage.isUserLogged()) {
            return true;
        }
        return false;
    }

    /**
     * Enter email address to the address field
     * @param email
     */
    public void enterUserEmailAddress(String email) {
        if(email!=null) {
            loginPage.enterEmailAddress(email);
        }
    }

    /**
     * Enter password to the password field
     * @param password
     */
    public void enterUserPassword(String password) {
        if(password!=null) {
            loginPage.enterPassword(password);
        }
    }

    /**
     * Get user email address from the account information section
     * @return email
     */
    public String getUserEmailAddress() {
        return commonPage.getUserEmailText();
    }

    /**
     * Click next button
     */
    public void clickNext() {
        loginPage.clickNextButton();
    }

    /**
     * Click enter button
     */
    public void clickEnter() {
        loginPage.clickEnterButton();
    }
}
