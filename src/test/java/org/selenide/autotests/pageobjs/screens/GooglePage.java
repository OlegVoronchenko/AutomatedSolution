package org.selenide.autotests.pageobjs.screens;

import org.selenide.autotests.pageobjs.base.BasePage;
import org.selenide.autotests.testfwk.constants.CommonConstans;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class GooglePage extends BasePage {
    int defaultTimeout = CommonConstans.DEFAULT_TIMEOUT;
    int longTimeout = CommonConstans.LONG_TIMEOUT;

    public void waitUntilPageIsLoaded() {
        waitUntilPageIsLoaded(defaultTimeout);
    }

    public void waitUntilPageIsLoaded(int timeOut){
        $(byText(CommonConstans.LOADING)).waitUntil(disappears, timeOut);
    }

}
