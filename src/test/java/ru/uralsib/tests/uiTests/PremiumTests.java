package ru.uralsib.tests.uiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.ui.components.SecondaryMenuComponent;
import ru.uralsib.ui.pages.premiumPages.PremiumPage;

import java.io.File;

@Epic("Тестирование сайта банка Uralsib (UI)")
@Feature("Тесты страницы 'Премиум'")
public class PremiumTests {

    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();
    PremiumPage premiumPage = new PremiumPage();

    @Test
    @Tag("Premium")
    @DisplayName("Открытие страницы 'Премиум'")
    public void checkPremiumPageWasOpened() {
        secondaryMenuComponent.openPremiumPage();
        premiumPage.checkPremiumPageWasOpened();

    }

    @Test
    @Tag("Premium")
    @DisplayName("Загрузка прайса")
    public void downloadPrice() {
        secondaryMenuComponent.openPremiumPage();
        File result = premiumPage
                .clickCreditCardButton()
                .clickTabPrice()
                .clickPriceCreditCard();

        premiumPage.checkDownloadPriceCreditCard("premial_credcard_200923_5akcgurx.pdf", result.getName());
    }
}