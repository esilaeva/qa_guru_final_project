package ru.uralsib.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.File;

@Epic("Testing the Uralsib Bank website (UI)")
@Feature("Tests of the 'Premium' page")
public class PremiumTests extends TestBase {

    @Test
    @Tag("premium")
    @DisplayName("Open 'Premium' page")
    public void checkPremiumPageWasOpened() {
        getSecondaryMenuComponent().openPremiumPage();
        getPremiumPage().checkPremiumPageWasOpened();
    }

    @Test
    @Tag("premium")
    @DisplayName("Download the document 'List of MCC codes'")
    public void downloadPrice() {
        getSecondaryMenuComponent().openPremiumPage();
        File result = getPremiumPage()
                .clickCreditCardButton()
                .clickTabPriceAndDocs()
                .clickDocsMcc();

        getPremiumPage().checkDownloadPriceCreditCard("perechen-kodov-mcc_1q7wit8h.pdf", result.getName());
    }
}