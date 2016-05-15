package org.selenide.autotests.pageobjs.screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.selenide.autotests.testfwk.constants.CommonConstans;
import org.selenide.autotests.testfwk.entities.UserProfile;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class LoginPage extends GooglePage {

    SelenideElement emailTextBox = $(byId(CommonConstans.EMAIL_TEXT_BOX_ID));
    SelenideElement pwdTextBox = $(byId(CommonConstans.PWD_TEXT_BOX_ID));
    SelenideElement nextButton = $(byId(CommonConstans.NEXT_BUTTON_ID));
    SelenideElement enterButton = $(byId(CommonConstans.ENTER_BUTTON_ID));
    SelenideElement emailDisplayTitle = $(byId(CommonConstans.EMAIL_DISPLAY_TITLE_ID));
    SelenideElement emailErrorMessage = $(byId(CommonConstans.EMAIL_ERROR_ID));
    SelenideElement passwordErrorMessage = $(byId(CommonConstans.PASSWORD_ERROR_ID));


    public SelenideElement getEmailTextBox() {
        return this.emailTextBox;
    }

    public SelenideElement getPwdTextBox() {
        return this.pwdTextBox;
    }

    public SelenideElement getNextButton() {
        return this.nextButton;
    }

    public SelenideElement getEnterButton() {
        return this.enterButton;
    }

    /**
     * Click on the email text field
     */
    void clickOnEmailTextBox() {
        emailTextBox.click();
    }

    /**
     * Click on the password text field
     */
    void clickOnPwdTextBox() {
        pwdTextBox.click();
    }

    /**
     * Check if the email text field is displayed
     *
     * @return true or false
     */
    boolean isEmailFieldDisplayed() {
        return emailTextBox.isDisplayed();
    }

    /**
     * Check if the password text field is displayed
     *
     * @return true or false
     */
    boolean isPwdFieldDisplayed() {
        return pwdTextBox.isDisplayed();
    }

    /**
     * Login to the email account
     *
     * @param user profile data
     */
    public void logIn(UserProfile user) {
        waitUntilPageIsLoaded();
        if (user != null) {
            enterEmailAddress(user.getEmail());
            clickNextButton();
            enterPassword(user.getPassword());
            clickEnterButton();
        }
    }

    /**
     * Check if the user login
     *
     * @return true or false
     */
    public boolean isUserLogged() {
        waitUntilPageIsLoaded();
        if (emailTextBox.is(Condition.present)) {
            return false;
        }
        return true;
    }

    /**
     * Enter user's email in the email text box with confirmation
     *
     * @param email
     */
    public void enterEmailAddress(String email) {
        enterEmailAddress(email, true);
    }

    /**
     * Enter user's email in the email text box
     *
     * @param email
     * @param isConfirmRequired true or false
     */
    public void enterEmailAddress(String email, boolean isConfirmRequired) {
        emailTextBox.waitUntil(Condition.present, defaultTimeout);
        if (emailTextBox.is(Condition.appear)) {
            if (isConfirmRequired) {
                emailTextBox.val(email).pressEnter();
            } else {
                emailTextBox.sendKeys(email);
            }
        }
    }

    /**
     * Enter user's password in the password text box with confirmation
     *
     * @param password
     */
    public void enterPassword(String password) {
        enterPassword(password, true);
    }

    /**
     * Enter user's email in the email text box
     *
     * @param password
     * @param isConfirmRequired true or false
     */
    public void enterPassword(String password, boolean isConfirmRequired) {
        pwdTextBox.waitUntil(Condition.present, defaultTimeout);
        if (pwdTextBox.is(Condition.appear)) {
            if (isConfirmRequired) {
                pwdTextBox.val(password).pressEnter();
                waitUntilPageIsLoaded();
            } else {
                pwdTextBox.sendKeys(password);
            }
        }
    }

    /**
     * Click on the Next button
     */
    public void clickNextButton() {
        waitUntilPageIsLoaded();
        if (nextButton.is(Condition.appear)) {
            nextButton.click();
            $(CommonConstans.ERROR_MSG).waitUntil(disappears, defaultTimeout);
        }
    }

    /**
     * Click on the Enter button
     */
    public void clickEnterButton() {
        waitUntilPageIsLoaded();
        if (enterButton.is(Condition.appear)) {
            enterButton.click();
            $(CommonConstans.ERROR_MSG).waitUntil(disappears, defaultTimeout);
        }
    }

    /**
     * Get user email displayed text
     *
     * @return email title
     */
    public String getUserEmail() {
        String email = "";
        emailDisplayTitle.waitUntil(Condition.present, defaultTimeout);
        if (emailDisplayTitle.is(Condition.appear)) {
            email = emailDisplayTitle.getText();
        }
        return email;
    }

    public boolean isEmailErrorMessageDisplayed() {
        nextButton.waitWhile(Condition.disabled, defaultTimeout);
        return emailErrorMessage.is(Condition.appears);
    }

    public boolean isPasswordErrorMessageDisplayed() {
        enterButton.waitWhile(Condition.disabled, defaultTimeout);
        return passwordErrorMessage.is(Condition.appears);
    }

    public void waitForMailLoading() {
        waitUntilPageIsLoaded(CommonConstans.EMAIL_LOADING_TIMEOUT);
    }
}
