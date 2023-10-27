package ru.uralsib.tests.uiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.tests.TestBase;
import ru.uralsib.ui.components.SecondaryMenuComponent;
import ru.uralsib.ui.pages.personalPages.*;

@Epic("Тестирование сайта банка Uralsib (UI)")
@Feature("Тесты страницы 'Частным лицам'")
public class PersonalPageTests extends TestBase {

    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();
    PersonalPage personal = new PersonalPage();
    DebetovyeKartyPage debKarty = new DebetovyeKartyPage();
    InvesticiiPage investiciiPage = new InvesticiiPage();
    IszhPage iszhPage = new IszhPage();

    @Test
    @Tag("Personal")
    @DisplayName("Открытие Main Page")
    public void checkPersonalButton() {
        secondaryMenuComponent.openMainPage();
        personal.checkPersonalPageWasOpened();
    }

    @Test
    @Tag("Personal")
    @DisplayName("Открытие страницы 'Дебетовые карты'")
    public void checkDebKartyButton() {
        secondaryMenuComponent.openMainPage();
        personal.openDebetovyeKartyPage();

        debKarty.checkDebKartyPageWasOpened();
    }

    @Test
    @Tag("Personal")
    @DisplayName("Появление кнопки 'Двойной кешбэк'")
    public void checkFaqWasShowed() {
        secondaryMenuComponent.openMainPage();
        personal.openDebetovyeKartyPage();

        debKarty
                .clickPremDebKarty()
                .checkBtnCashBackWasOpened();
    }

    @Test
    @Tag("Personal")
    @DisplayName("инвестиции")
    public void checkInvesticii() {
        secondaryMenuComponent.openMainPage();
        personal.openInvesticiiPage();
        investiciiPage.clickBtnMoreInfo();
        iszhPage.clickBtnSubmitApp().checkRequestConsultation();
    }
}