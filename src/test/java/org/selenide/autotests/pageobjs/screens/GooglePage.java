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

    int commonTimeOut = CommonConstans.DEFAULT_TIMEOUT;

    public void waitUntilPagesIsLoaded() {
        $(byText(CommonConstans.LOADING)).waitUntil(disappears, commonTimeOut);
    }

}
