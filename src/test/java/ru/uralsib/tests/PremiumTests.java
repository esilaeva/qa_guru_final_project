package ru.uralsib.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.File;

@Epic("Тестирование сайта банка Uralsib (UI)")
@Feature("Тесты страницы 'Премиум'")
public class PremiumTests extends TestBase {

    @Test
    @Tag("premium")
    @DisplayName("Открытие страницы 'Премиум'")
    public void checkPremiumPageWasOpened() {
        getSecondaryMenuComponent().openPremiumPage();
        getPremiumPage().checkPremiumPageWasOpened();
    }

    @Test
    @Tag("premium")
    @DisplayName("Загрузка прайса")
    public void downloadPrice() {
        getSecondaryMenuComponent().openPremiumPage();
        File result = getPremiumPage()
                .clickCreditCardButton()
                .clickTabPrice()
                .clickPriceCreditCard();

        getPremiumPage().checkDownloadPriceCreditCard("premial_credcard_200923_5akcgurx.pdf", result.getName());
    }
}