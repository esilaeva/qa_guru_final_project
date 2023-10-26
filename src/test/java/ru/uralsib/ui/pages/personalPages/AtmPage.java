package ru.uralsib.ui.pages.personalPages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

@Data
public class AtmPage {

    public SelenideElement listAtm = $("ymaps");

    public void checkAtmPageWasOpened() {
        getListAtm().shouldBe(appear);
    }
}