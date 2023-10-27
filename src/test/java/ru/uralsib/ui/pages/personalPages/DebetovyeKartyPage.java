package ru.uralsib.ui.pages.personalPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Data
public class DebetovyeKartyPage {

    public SelenideElement
            debKarty = $("div.ProductListTemplate___bannerWrapper__diX8p"),
            premDebKarty = $("div.Chips___wrapper__GpaZ7").$(byText("Премиальные")),
            btnCashBack = $("div #info").$(byText("Двойной кешбэк"));

    @Step("Проверка: страница 'Дебетовые карты' открыта")
    public void checkDebKartyPageWasOpened() {
        getDebKarty().shouldBe(appear);
    }

    @Step("Выбор 'Дебетовые карты' -> 'Премиальные'")
    public DebetovyeKartyPage clickPremDebKarty()
    {
        getPremDebKarty().click();

        return this;
    }

    @Step("Проверка: появилась кнопка 'Двойной кешбэк'")
    public void checkBtnCashBackWasOpened() {
        getBtnCashBack().shouldBe(appear);
    }
}