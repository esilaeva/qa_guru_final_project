package ru.uralsib.tests.uiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.tests.TestBase;

@Epic("Тестирование сайта банка Uralsib (UI)")
@Feature("Тесты страницы 'Частным лицам'")
public class PersonalPageTests extends TestBase {

    @Test
    @Tag("Personal")
    @DisplayName("Открытие Main Page")
    public void checkPersonalButton() {
        getSecondaryMenuComponent().openMainPage();
        getPersonalPage().checkPersonalPageWasOpened();
    }

    @Test
    @Tag("Personal")
    @DisplayName("Открытие страницы 'Дебетовые карты'")
    public void checkDebKartyButton() {
        getSecondaryMenuComponent().openMainPage();
        getPersonalPage().openDebetovyeKartyPage();

        getDebKarty().checkDebKartyPageWasOpened();
    }

    @Test
    @Tag("Personal")
    @DisplayName("Появление кнопки 'Двойной кешбэк'")
    public void checkFaqWasShowed() {
        getSecondaryMenuComponent().openMainPage();
        getPersonalPage().openDebetovyeKartyPage();

        getDebKarty()
                .clickPremDebKarty()
                .checkBtnCashBackWasOpened();
    }

    @Test
    @Tag("Personal")
    @DisplayName("инвестиции")
    public void checkInvesticii() {
        getSecondaryMenuComponent().openMainPage();
        getPersonalPage().openInvesticiiPage();
        getInvesticiiPage().clickBtnMoreInfo();
        getIszhPage().clickBtnSubmitApp().checkRequestConsultation();
    }
}