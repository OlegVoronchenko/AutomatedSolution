package org.selenide.AutomatedTests.Features;

import org.selenide.AutomatedTests.BaseEntities.BaseFeature;
import org.selenide.AutomatedTests.GooglePages.LoginPage;
import org.selenide.AutomatedTests.GooglePages.EmailsPage;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class AuthorizationFeature extends BaseFeature {
    LoginPage userNamePage = new LoginPage();
    EmailsPage commonPage = new EmailsPage();

    String getPageName(){
        return null;
    }

    String getFieldName(){
        return null;
    }
}
