package ru.uralsib.tests.uiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.tests.TestBase;
import ru.uralsib.ui.components.SecondaryMenuComponent;
import ru.uralsib.ui.pages.personalPages.AtmPage;
import ru.uralsib.ui.pages.personalPages.DebetovyeKartyPage;
import ru.uralsib.ui.pages.personalPages.PersonalPage;

@Epic("Тестирование сайта банка Uralsib (UI)")
@Feature("Тесты страницы 'Частным лицам'")
public class PersonalPageTests extends TestBase {

    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();
    PersonalPage personal = new PersonalPage();
    DebetovyeKartyPage debKarty = new DebetovyeKartyPage();
    AtmPage listAtm = new AtmPage();

    @Test
    @Tag("Personal")
    @DisplayName("Открытие страницы 'Частным лицам'")
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
    @DisplayName("Открытие страницы 'Банкоматы'")
    public void checkAtmButton() {
        secondaryMenuComponent.openMainPage();
        personal.openAtmPage();

        listAtm.checkAtmPageWasOpened();
    }
}