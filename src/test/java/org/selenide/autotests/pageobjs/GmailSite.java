package org.selenide.autotests.pageobjs;

import org.selenide.autotests.pageobjs.base.BaseSite;
import org.selenide.autotests.pageobjs.features.AuthorizationFeature;
import org.selenide.autotests.pageobjs.features.NavigationFeature;

/**
 * Created by Oleg Voronchenko on 5/10/2016.
 */
public class GmailSite extends BaseSite {
    //Features
    public AuthorizationFeature authorization = new AuthorizationFeature();
    public NavigationFeature navigation = new NavigationFeature();


}
