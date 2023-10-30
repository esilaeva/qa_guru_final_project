package ru.uralsib.pages.personalPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Data
public class InvesticiiPage {

    public SelenideElement btnMoreInfo = $(byText("Подробнее"));

    @Step("Click button MORE")
    public InvesticiiPage clickBtnMoreInfo() {
        getBtnMoreInfo().click();

        return this;
    }
}