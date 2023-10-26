package ru.uralsib.tests.uiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.tests.TestBase;
import ru.uralsib.ui.components.SecondaryMenuComponent;
import ru.uralsib.ui.pages.businessPages.BusinessPage;
import ru.uralsib.ui.pages.businessPages.VedPage;

@Epic("Тестирование сайта банка Uralsib (UI)")
@Feature("Тесты страницы 'Бизнесу'")
public class BusinessTests extends TestBase {

    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();
    BusinessPage businessPage = new BusinessPage();
    VedPage vedPage = new VedPage();

    @Test
    @Tag("Business")
    @DisplayName("Открытие страницы 'Депозиты'")
    public void checkDepositPageWasOpened() {
        secondaryMenuComponent.openBusinessPage();
        businessPage.clickDepositButton();
        vedPage.checkVedTitle();
    }

    @Test
    @Tag("Business")
    @DisplayName("Выбор зарплатного проекта")
    public void checkBusinessCardPageWasOpened() {
        secondaryMenuComponent.openBusinessPage();
        businessPage
                .clickSalaryProjectsButton()
                .clickPriceButton()
                .clickBigOrganizationButton()

                .checkBntMakeRequestExists();
    }
}