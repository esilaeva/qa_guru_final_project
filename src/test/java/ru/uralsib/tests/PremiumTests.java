package ru.uralsib.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.annotations.JiraIssue;
import ru.uralsib.annotations.JiraIssues;
import ru.uralsib.pages.components.SecondaryMenuComponent;
import ru.uralsib.pages.premiumPages.PremiumPage;

import java.io.File;

@Epic("Testing the Uralsib Bank website (UI)")
@Feature("Tests of the 'Premium' page")
public class PremiumTests extends TestBase {

    PremiumPage premiumPage = new PremiumPage();
    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();

    @Test
    @Tag("premium")
    @DisplayName("Open 'Premium' page")
    public void checkPremiumPageWasOpenedTest() {
        secondaryMenuComponent.openPremiumPage();
        premiumPage.checkPremiumPageWasOpened();
    }

    @Test
    @Tag("premium")
    @Tag("web")
    @Owner("Elena")
    @JiraIssues({@JiraIssue("HOMEWORK-928")})
    @DisplayName("Download the document 'List of MCC codes'")
    public void downloadPriceTest() {
        secondaryMenuComponent.openPremiumPage();
        File result = premiumPage
                .clickCreditCardButton()
                .clickTabPriceAndDocs()
                .clickDocsMcc();

        premiumPage.checkDownloadPriceCreditCard("perechen-kodov-mcc_1q7wit8h.pdf", result.getName());
    }
}