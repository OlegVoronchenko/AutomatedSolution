package org.selenide.autotests.pageobjs.features;

import org.selenide.autotests.pageobjs.base.BaseFeature;
import org.selenide.autotests.pageobjs.screens.SiteActions;

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
