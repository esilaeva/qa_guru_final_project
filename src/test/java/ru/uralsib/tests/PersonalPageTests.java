package ru.uralsib.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.pages.components.SecondaryMenuComponent;
import ru.uralsib.pages.personalPages.DebetovyeKartyPage;
import ru.uralsib.pages.personalPages.InvestmentsPage;
import ru.uralsib.pages.personalPages.LifeInsurancePage;
import ru.uralsib.pages.personalPages.PersonalPage;

@Epic("Testing the Uralsib Bank website (UI)")
@Feature("Tests of the 'Personal' page")
public class PersonalPageTests extends TestBase {

    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();
    PersonalPage personalPage = new PersonalPage();
    DebetovyeKartyPage debKarty = new DebetovyeKartyPage();
    InvestmentsPage investmentsPage = new InvestmentsPage();
    LifeInsurancePage lifeInsurancePage = new LifeInsurancePage();

    @Test
    @Tag("personal")
    @DisplayName("Open the 'Personal' page")
    public void checkPersonalButton() {
        secondaryMenuComponent.openPersonalPage();

        personalPage.checkPersonalPageWasOpened();
    }

    @Test
    @Tag("personal")
    @DisplayName("Open 'Debit Cards' page")
    public void checkDebitCardsButton() {
        secondaryMenuComponent.openPersonalPage();
        personalPage.openDebitCardsPage();

        debKarty.checkDebKartyPageWasOpened();
    }

    @Test
    @Tag("personal")
    @DisplayName("Appearance of the 'Double cashback' button")
    public void checkFaqWasShowed() {
        secondaryMenuComponent.openPersonalPage();
        personalPage.openDebitCardsPage();

        debKarty
                .clickPremDebKarty()
                .checkBtnCashBackWasOpened();
    }

    @Test
    @Tag("personal")
    @DisplayName("A request for consultation has appeared")
    public void checkInvestments() {
        secondaryMenuComponent.openPersonalPage();
        personalPage.openInvestmentsPage();
        investmentsPage.clickBtnMoreDetailsInfo();

        lifeInsurancePage
                .clickBtnSubmitApp()

                .checkRequestConsultation();
    }
}