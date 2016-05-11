package org.selenide.AutomatedTests.pageobjs.features;

import org.selenide.AutomatedTests.pageobjs.base.BaseFeature;
import org.selenide.AutomatedTests.pageobjs.screens.EmailsPage;
import org.selenide.AutomatedTests.pageobjs.screens.LoginPage;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class AuthorizationFeature extends BaseFeature {
    LoginPage loginPage = new LoginPage();
    EmailsPage commonPage = new EmailsPage();

    String getPageName(){
        return null;
    }

    String getFieldName(){
        return null;
    }

    /**
     * Logout from the account
     */
    public void logOutFromAccount() {
        if(isUserLogged())
        {
            //logOut();
        }
    }

    public void logOut() {
        //loginPage.logOut();
        commonPage.clickOnUserBox();
        commonPage.clickOnSignOutButton();
    }

    /* TO-DO user
    public void logIn() {
        loginPage.logIn();
    }*/

    public boolean isUserLogged() {
        if (loginPage.isUserLogged()) {
            return true;
        }
        return false;
    }

    public void enterUserEmailAddress(String email) {
        if(email!=null) {
            loginPage.enterEmailAddress(email);
        }
    }

    public void enterUserPassword(String password) {
        if(password!=null) {
            loginPage.enterPassword(password);
        }
    }

    public void clickNext() {
        loginPage.clickNextButton();
    }

    public void clickEnter() {
        loginPage.clickEnterButton();
    }
}
