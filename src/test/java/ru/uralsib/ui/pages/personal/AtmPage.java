package ru.uralsib.ui.pages.personal;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class AtmPage {

    public SelenideElement listAtm = $("ymaps");

    public void checkAtmPageWasOpened() {
        listAtm.shouldBe(appear);
    }
}