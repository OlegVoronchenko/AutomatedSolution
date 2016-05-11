package org.selenide.AutomatedTests.pageobjs.features;

import org.selenide.AutomatedTests.pageobjs.base.BaseFeature;
import org.selenide.AutomatedTests.pageobjs.screens.SiteActions;

/**
 * Created by Oleg Voronchenko on 5/10/2016.
 */
public class NavigationFeature extends BaseFeature {
    SiteActions actions = new SiteActions();

    public void navigateTo(String url) {
        actions.openUrl(url);
    }

    public void closeSite() {
        actions.closeSite();
    }
}
