package ru.uralsib.ui.pages.premiumPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class CreditCardsPage {

    public SelenideElement
            tabPrice = $("#rc-tabs-0-tab-1"),
            priceCreditCardPremium = $("a href='https://www.uralsib.ru/api/directory-engine/files/rates/premial_credcard_200923_5akcgurx.pdf'");

    @Step("Переход на вкладку 'Тарифы и документы'")
    public CreditCardsPage openPremiumPage() {
        getTabPrice().click();

        return this;
    }

    @Step("Переход на вкладку 'Тарифы и документы'")
    public CreditCardsPage clickTabPrice() {
        getTabPrice().click();

        return this;
    }

    @Step("Скачать файл условия тарифа 'Кредитная карта с набором услуг Премиальный'")
    public CreditCardsPage clickCreditCardPremiumPrice() {
        getPriceCreditCardPremium().click();

        return this;
    }
}