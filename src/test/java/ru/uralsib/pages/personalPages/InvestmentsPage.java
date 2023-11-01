package ru.uralsib.pages.personalPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Data
public class InvestmentsPage {

    public SelenideElement btnMoreDetails = $(byText("Подробнее"));

    @Step("Click 'More details' button")
    public InvestmentsPage clickBtnMoreDetailsInfo() {
        getBtnMoreDetails().click();

        return this;
    }
}