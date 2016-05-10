package org.selenide.AutomatedTests.Features;

import org.selenide.AutomatedTests.BaseEntities.BaseFeature;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by oleg.voronchenko on 5/10/2016.
 */
public class NavigationFeature extends BaseFeature{

    public void NavigateTo(String url){
        open(url);
    }
}
