package org.selenide.autotests.pageobjs.screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.selenide.autotests.testfwk.constants.CommonConstans;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

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

    public String getUserProfileEmail() {
       /* String email = "";
        userBox.waitUntil(Condition.present, commonTimeOut);
        if (userBox.is(Condition.appear)) {
            clickOnUserBox();
            email = userAccountEmail.getText();
            clickOnUserBox();
        }
        return email;*/
        String title1 = title();
        String email = "";
        waitUntilPagesIsLoaded();
        String title2 = title();
        boolean sel = userBox.is(Condition.present);
        email = "";
        String title3 = title();

        if(userBox.is(Condition.present)) {
            userBox.waitUntil(Condition.appear, commonTimeOut);
            clickOnUserBox();
            email = userAccountEmail.getText();
            clickOnUserBox();
        }
        return email;
    }
}
