package org.selenide.autotests.pageobjs.screens;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class SiteActions {

    public void openUrl(String url){
        open(url);
    }

    public void closeSite() {
        close();
    }
}
