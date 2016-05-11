package org.selenide.AutomatedTests.pageobjs.screens;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.selenide.AutomatedTests.testfwk.constants.CommonConstans;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class EmailsPage extends GooglePage {
    //Elements section
    private SelenideElement userBox;
    private SelenideElement signOutButton;

    public void clickOnUserBox(){
        if(getUserBox().isDisplayed()){
            getUserBox().click();
        }
    }

    public void clickOnSignOutButton(){
        if(getSignOutButton().isDisplayed()){
            getSignOutButton().click();
        }
    }

    //region - Private methods' section
    private SelenideElement getUserBox(){
        return $(By.className(CommonConstans.USER_ACCOUNT_BOX_CLASS_NAME));
    }

    private SelenideElement getSignOutButton(){
        return $(By.id(CommonConstans.SIGN_OUT_BUTTON_ID));
    }
    //endregion

}
