package org.selenide.autotests.pageobjs.screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.selenide.autotests.testfwk.constants.CommonConstans;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class EmailsPage extends GooglePage {
    //Elements section
    private SelenideElement userBox = $(By.className(CommonConstans.USER_ACCOUNT_BOX_CLASS_NAME));
    private SelenideElement signOutButton = $(byId(CommonConstans.SIGN_OUT_BUTTON_ID));
    private SelenideElement userAccountEmail = $(By.className(CommonConstans.USER_ACCOUNT_EMAIL_CLASS_NAME));

    public SelenideElement getUserBox() {
        return this.userBox;
    }

    public SelenideElement getSignOutButton(){
        return this.signOutButton;
    }

    public void clickOnUserBox(){
        if(userBox.isDisplayed()) userBox.click();
    }

    public void clickOnSignOutButton() {
        if(signOutButton.isDisplayed()) signOutButton.click();
    }

    public String getUserEmailText(){
        userBox.should(Condition.appear);
        clickOnUserBox();
        String email = userAccountEmail.getText();
        clickOnUserBox();
        return email;
    }
}
