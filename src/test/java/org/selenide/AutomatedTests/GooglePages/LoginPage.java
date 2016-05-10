package org.selenide.AutomatedTests.GooglePages;

import com.codeborne.selenide.SelenideElement;
import org.selenide.AutomatedTests.Entities.UserProfile;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class LoginPage extends GooglePage{
    //Elements' id section
    //#Email

    private String emailTextBoxIdentifier = "000";
    private String pwdTextBoxIdentifier = "000";

    //Elements section
    private SelenideElement emailTextBox;
    private SelenideElement pwdTextBox;

    //Need to be check
    UserProfile testUser;

    private SelenideElement getEmailTextBox(){
        return $(emailTextBoxIdentifier);
    }

    private SelenideElement getPwdTextBox(){
        return $(pwdTextBoxIdentifier);
    }

    void clickOnEmailTextBox(){
        getEmailTextBox().click();
    }
    
    void clickOnPwdTextBox(){
        getPwdTextBox().click();
    }
    
    boolean isEmailFieldDisplayed(){
        return getEmailTextBox().isDisplayed();
    }
    
    boolean isPwdFieldDisplayed(){
        return getPwdTextBox().isDisplayed();
    }
}
