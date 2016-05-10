package org.selenide.AutomatedTests;

import org.selenide.AutomatedTests.BaseEntities.BaseSite;
import org.selenide.AutomatedTests.Features.AuthorizationFeature;
import org.selenide.AutomatedTests.Features.NavigationFeature;

/**
 * Created by oleg.voronchenko on 5/10/2016.
 */
public class GmailSite extends BaseSite {

    //Features
    public AuthorizationFeature authorization = new AuthorizationFeature();
    public NavigationFeature navigation = new NavigationFeature();

    public GmailSite(){ }
}
