package ru.uralsib.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.pages.businessPages.BusinessPage;
import ru.uralsib.pages.businessPages.VedPage;
import ru.uralsib.pages.components.SecondaryMenuComponent;

@Epic("Testing the Uralsib Bank website (UI)")
@Feature("Tests of the 'Business' page")
public class BusinessTests extends TestBase {

    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();
    BusinessPage businessPage = new BusinessPage();
    VedPage vedPage = new VedPage();

    @Test
    @Tag("business")
    @DisplayName("View documents on the customs card 'ROUND'")
    public void checkDepositPageWasOpened() {
        secondaryMenuComponent.openBusinessPage();
        businessPage.clickVedButton();
        vedPage
                .clickDocsAndPriceButton()
                .clickCustomsCardRound()

                .checkServiceCardRoundExist();
    }

    @Test
    @Tag("business")
    @DisplayName("Selecting a salary project")
    public void checkBusinessCardPageWasOpened() {
        secondaryMenuComponent.openBusinessPage();
        businessPage
                .clickSalaryProjectsButton()
                .clickPriceButton()
                .clickBigOrganizationButton()

                .checkBntMakeRequestExists();
    }
}