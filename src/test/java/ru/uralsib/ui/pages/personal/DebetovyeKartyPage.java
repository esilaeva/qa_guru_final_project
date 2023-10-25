package ru.uralsib.ui.pages.personal;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class DebetovyeKartyPage {

    public SelenideElement debKarty = $("div.ProductListTemplate___bannerWrapper__diX8p");

    public void checkDebKartyPageWasOpened() {
        debKarty.shouldBe(appear);
    }
}