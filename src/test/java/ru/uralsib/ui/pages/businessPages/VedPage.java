package ru.uralsib.ui.pages.businessPages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Data
public class VedPage {

    public SelenideElement vedTitle = $(byText("Внешнеэкономическая деятельность"));

    public void checkVedTitle() {
        getVedTitle().shouldBe(appear);
    }
}