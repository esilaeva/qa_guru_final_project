package ru.uralsib.pages.personalPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Data
public class IszhPage {

    public SelenideElement
            btnSubmitApp = $(byText("Оставить заявку")),
            requestConsultation = $(byText("Заявка на консультацию"));

    @Step("Click button MORE")
    public IszhPage clickBtnSubmitApp() {
        getBtnSubmitApp().click();

        return this;
    }

    @Step("check")
    public IszhPage checkRequestConsultation() {
        getRequestConsultation().shouldBe(appear);

        return this;
    }
}