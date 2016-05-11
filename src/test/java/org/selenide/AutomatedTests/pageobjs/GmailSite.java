package org.selenide.AutomatedTests.pageobjs;

import org.selenide.AutomatedTests.pageobjs.base.BaseSite;
import org.selenide.AutomatedTests.pageobjs.features.AuthorizationFeature;
import org.selenide.AutomatedTests.pageobjs.features.NavigationFeature;

/**
 * Created by oleg.voronchenko on 5/10/2016.
 */
public class GmailSite extends BaseSite {

    //Features
    public AuthorizationFeature authorization = new AuthorizationFeature();
    public NavigationFeature navigation = new NavigationFeature();

    public GmailSite(){ }
}
