package ru.uralsib.pages.personalPages;

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

    @Step("Verify: 'Debit Cards' page is open")
    public void checkDebKartyPageWasOpened() {
        getDebKarty().shouldBe(appear);
    }

    @Step("Selecting 'Debit cards' -> 'Premium'")
    public DebetovyeKartyPage clickPremDebKarty()
    {
        getPremDebKarty().click();

        return this;
    }

    @Step("Verify: the 'Double cashback' button appeared")
    public void checkBtnCashBackWasOpened() {
        getBtnCashBack().shouldBe(appear);
    }
}