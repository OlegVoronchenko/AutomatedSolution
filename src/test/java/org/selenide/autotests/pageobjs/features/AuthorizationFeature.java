package org.selenide.autotests.pageobjs.features;

import org.selenide.autotests.pageobjs.base.BaseFeature;
import org.selenide.autotests.pageobjs.screens.EmailsPage;
import org.selenide.autotests.pageobjs.screens.LoginPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class AuthorizationFeature extends BaseFeature {
    LoginPage loginPage = new LoginPage();
    EmailsPage commonPage = new EmailsPage();

    /**
     * Logout from the account
     */
    @Step
    public void logOutFromAccount() {
        if(isUserLogged()) { logOut(); }
    }

    /**
     * Logging out
     */
    @Step
    public void logOut() {
        commonPage.clickOnUserBox();
        commonPage.clickOnSignOutButton();
    }

    /**
     * Is user logined
     * @return true or false
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
    @Step("Enter email address to the address field")
    public void enterUserEmailAddress(String email) {
        if(email!=null) {
            loginPage.enterEmailAddress(email);
        }
    }

    /**
     * Enter password to the password field
     * @param password
     */
    @Step("Enter password to the password field")
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
        return commonPage.getUserProfileEmail();
    }

    /**
     * Click next button
     */
    @Step("Click next button")
    public void clickNext() {
        loginPage.clickNextButton();
    }

    /**
     * Click enter button
     */
    @Step("Click enter button")
    public void clickEnter() {
        loginPage.clickEnterButton();
    }

    /**
     * Get user email address from the password form
     * @return email
     */
    public String getUserEmailOnLoginForm() {
        return loginPage.getUserEmail();
    }

    /**
     * Is Email error message displayed
     * @return true or false
     */
    public boolean isEmailErrorMessageDisplayed() {
        return loginPage.isEmailErrorMessageDisplayed();
    }

    /**
     * Is Password error message displayed
     * @return true or false
     */
    public boolean isPasswordErrorMessageDisplayed() {
        return loginPage.isPasswordErrorMessageDisplayed();
    }

    /**
     * Wait for email loading
     */
    @Step("Wait for email loading")
    public void waitForMailLoading() {
        loginPage.waitForMailLoading();
    }
}
