package ru.uralsib.tests.uiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.tests.TestBase;

@Epic("Тестирование сайта банка Uralsib (UI)")
@Feature("Тесты страницы 'Бизнесу'")
public class BusinessTests extends TestBase {

    @Test
    @Tag("business")
    @DisplayName("Открытие страницы 'Депозиты'")
    public void checkDepositPageWasOpened() {
        getSecondaryMenuComponent().openBusinessPage();
        getBusinessPage().clickDepositButton();
        getVedPage().checkVedTitle();
    }

    @Test
    @Tag("business")
    @DisplayName("Выбор зарплатного проекта")
    public void checkBusinessCardPageWasOpened() {
        getSecondaryMenuComponent().openBusinessPage();
        getBusinessPage()
                .clickSalaryProjectsButton()
                .clickPriceButton()
                .clickBigOrganizationButton()

                .checkBntMakeRequestExists();
    }
}