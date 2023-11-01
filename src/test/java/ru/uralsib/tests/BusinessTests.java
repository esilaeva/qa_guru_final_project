package ru.uralsib.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Testing the Uralsib Bank website (UI)")
@Feature("Tests of the 'Business' page")
public class BusinessTests extends TestBase {

    @Test
    @Tag("business")
    @DisplayName("View documents on the customs card 'ROUND'")
    public void checkDepositPageWasOpened() {
        getSecondaryMenuComponent().openBusinessPage();
        getBusinessPage().clickVedButton();
        getVedPage()
                .clickDocsAndPriceButton()
                .clickCustomsCardRound()

                .checkServiceCardRoundExist();
    }

    @Test
    @Tag("business")
    @DisplayName("Selecting a salary project")
    public void checkBusinessCardPageWasOpened() {
        getSecondaryMenuComponent().openBusinessPage();
        getBusinessPage()
                .clickSalaryProjectsButton()
                .clickPriceButton()
                .clickBigOrganizationButton()

                .checkBntMakeRequestExists();
    }
}