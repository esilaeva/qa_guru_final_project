package ru.uralsib.ui.pages.business;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Ved {

    public SelenideElement vedTitle = $(byText("Внешнеэкономическая деятельность"));

    public void checkVedTitle() {
        vedTitle.shouldBe(appear);
    }
}