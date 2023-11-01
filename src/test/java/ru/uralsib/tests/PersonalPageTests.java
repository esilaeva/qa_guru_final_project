package ru.uralsib.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Testing the Uralsib Bank website (UI)")
@Feature("Tests of the 'Personal' page")
public class PersonalPageTests extends TestBase {

    @Test
    @Tag("personal")
    @DisplayName("Open the 'Personal' page")
    public void checkPersonalButton() {
        getSecondaryMenuComponent().openPersonalPage();

        getPersonalPage().checkPersonalPageWasOpened();
    }

    @Test
    @Tag("personal")
    @DisplayName("Open 'Debit Cards' page")
    public void checkDebitCardsButton() {
        getSecondaryMenuComponent().openPersonalPage();
        getPersonalPage().openDebitCardsPage();

        getDebKarty().checkDebKartyPageWasOpened();
    }

    @Test
    @Tag("personal")
    @DisplayName("Appearance of the 'Double cashback' button")
    public void checkFaqWasShowed() {
        getSecondaryMenuComponent().openPersonalPage();
        getPersonalPage().openDebitCardsPage();

        getDebKarty()
                .clickPremDebKarty()
                .checkBtnCashBackWasOpened();
    }

    @Test
    @Tag("personal")
    @DisplayName("A request for consultation has appeared")
    public void checkInvestments() {
        getSecondaryMenuComponent().openPersonalPage();
        getPersonalPage().openInvestmentsPage();
        getInvestmentsPage().clickBtnMoreDetailsInfo();

        getIszhPage()
                .clickBtnSubmitApp()

                .checkRequestConsultation();
    }
}