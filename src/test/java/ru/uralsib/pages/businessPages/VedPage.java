package ru.uralsib.pages.businessPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Data
public class VedPage {

    public SelenideElement
            vedTitle = $(byText("Внешнеэкономическая деятельность")),
            docsAndPrice = $("div").$(byText("Документы и тарифы")),
            customsCardRound = $("div #tamozhennaya-karta-raund"),
            serviceCardRound = $(byText("Условия обслуживания счета и карт «РАУНД»"));

    @Step("Go to the section 'Documents and tariffs' section")
    public VedPage clickDocsAndPriceButton(){
        getDocsAndPrice().click();

        return this;
    }

    @Step("Go to the section 'Customs Card ROUND'")
    public VedPage clickCustomsCardRound(){
        getCustomsCardRound().click();

        return this;
    }

    @Step("Verify: Terms of service for the 'ROUND' account and cards exist")
    public void checkServiceCardRoundExist(){
        getServiceCardRound().shouldBe(appear);
    }
}