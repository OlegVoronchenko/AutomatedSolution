package org.selenide.AutomatedTests.pageobjs.screens;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.selenide.AutomatedTests.testfwk.entities.UserProfile;
import org.selenide.AutomatedTests.testfwk.constants.CommonConstans;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class LoginPage extends GooglePage {
    //Elements section
    private SelenideElement emailTextBox;
    private SelenideElement pwdTextBox;
    private SelenideElement nextButton;
    private SelenideElement enterButton;

    //Need to be check
    UserProfile testUser;

    /**
     * Click on the email text field
     */
    void clickOnEmailTextBox(){
        getEmailTextBox().click();
    }

    /**
     * Click on the password text field
     */
    void clickOnPwdTextBox(){
        getPwdTextBox().click();
    }

    /**
     * Check if the email text field is displayed
     * @return
     */
    boolean isEmailFieldDisplayed(){
        return getEmailTextBox().isDisplayed();
    }

    /**
     * Check if the password text field is displayed
     * @return true or false
     */
    boolean isPwdFieldDisplayed(){
        return getPwdTextBox().isDisplayed();
    }

    /**
     * Log out from account
     */
    public void logOut() {
        String a = "0";
        //TO-DO
        /*
        if (то - то) {
            сделать так;
        }

        if (то-то) {
            сделать так;
        }*/
    }

    /**
     * Login to the email account
     * @param user profile data
     */
    public void logIn(UserProfile user) {
        //TO-DO check and navigate
        enterEmailAddress(user.getEmail());
        clickNextButton();
        enterPassword(user.getPassword());
        clickEnterButton();
    }

    /**
     * Check if the user login
     * @return true or false
     */
    public boolean isUserLogged() {
        if(getEmailTextBox().isDisplayed()){
            return false;
        }
        return true;
    }

    /**
     * Enter user's email in the email text box
     * @param email
     */
    public void enterEmailAddress(String email) {
        if(getEmailTextBox().isDisplayed()){
            getEmailTextBox().setValue(email);
        }
    }

    /**
     * Enter user's password in the password text box
     * @param password
     */
    public void enterPassword(String password) {
        if(getPwdTextBox().isDisplayed()){
            getPwdTextBox().setValue(password);
        }
    }

    /**
     * Click on the Next button
     */
    public void clickNextButton() {
        if(getNextButton().isDisplayed()) {
            getNextButton().click();
        }
    }

    /**
     * Click on the Enter button
     */
    public void clickEnterButton() {
        if(getEnterButton().isDisplayed()) {
            getEnterButton().click();
        }
    }

    //region - Private methods' section
    private SelenideElement getEmailTextBox(){
        return $(By.id(CommonConstans.EMAIL_TEXT_BOX_ID));
    }

    private SelenideElement getPwdTextBox(){
        return $(By.id(CommonConstans.PWD_TEXT_BOX_ID));
    }

    private SelenideElement getNextButton() {
        return $(By.id(CommonConstans.NEXT_BUTTON_ID));
    }

    private SelenideElement getEnterButton() {
        return $(By.id(CommonConstans.ENTER_BUTTON_ID));
    }
    //endregion
}
