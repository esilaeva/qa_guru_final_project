package ru.uralsib.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import ru.uralsib.annotations.JiraIssue;
import ru.uralsib.annotations.JiraIssues;

import java.io.File;

@Epic("Testing the Uralsib Bank website (UI)")
@Feature("Tests of the 'Premium' page")
public class PremiumTests extends TestBase {

    @Test
    @Tag("premium")
    @DisplayName("Open 'Premium' page")
    public void checkPremiumPageWasOpenedTest() {
        getSecondaryMenuComponent().openPremiumPage();
        getPremiumPage().checkPremiumPageWasOpened();
    }

    @Test
    @Tag("premium")
    @Tag("web")
    @Owner("Elena")
    @JiraIssues({@JiraIssue("HOMEWORK-928")})
    @DisplayName("Download the document 'List of MCC codes'")
    public void downloadPriceTest() {
        getSecondaryMenuComponent().openPremiumPage();
        File result = getPremiumPage()
                .clickCreditCardButton()
                .clickTabPriceAndDocs()
                .clickDocsMcc();

        getPremiumPage().checkDownloadPriceCreditCard("perechen-kodov-mcc_1q7wit8h.pdf", result.getName());
    }
}