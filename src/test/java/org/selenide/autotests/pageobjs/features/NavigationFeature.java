package org.selenide.autotests.pageobjs.features;

import org.selenide.autotests.pageobjs.base.BaseFeature;
import org.selenide.autotests.pageobjs.screens.SiteActions;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Oleg Voronchenko on 5/10/2016.
 */
public class NavigationFeature extends BaseFeature {
    SiteActions actions = new SiteActions();

    /**
     * Launch browser and navigate to url
     * @param url string
     */
    @Step("Launch browser and navigate to {0} url")
    public void navigateTo(String url) {
        actions.openUrl(url);
    }

    /**
     * Close site
     */
    @Step("Closing site and browser")
    public void closeSite() {
        actions.closeSite();
    }
}
