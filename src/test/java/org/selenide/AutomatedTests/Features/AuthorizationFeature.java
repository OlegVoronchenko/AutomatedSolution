package org.selenide.AutomatedTests.Features;

import org.selenide.AutomatedTests.BaseEntities.BaseFeature;
import org.selenide.AutomatedTests.GooglePages.LoginNamePage;
import org.selenide.AutomatedTests.GooglePages.MailCommonPage;
import org.selenide.AutomatedTests.GooglePages.PasswordPage;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class AuthorizationFeature extends BaseFeature {
    LoginNamePage loginNamePage = new LoginNamePage();
    PasswordPage passwordPage = new PasswordPage();
    MailCommonPage commonPage = new MailCommonPage();

    String getPageName(){
        return null;
    }

    String getFieldName(){
        return null;
    }
}
