package org.selenide.AutomatedTests.pageobjs.features;

import org.selenide.AutomatedTests.pageobjs.base.BaseFeature;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Oleg Voronchenko on 5/10/2016.
 */
public class NavigationFeature extends BaseFeature {

    public void navigateTo(String url){

        open(url);
    }

    public void closeSite() {
        close();
    }
}
