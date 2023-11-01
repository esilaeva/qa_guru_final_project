package ru.uralsib.pages.premiumPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;
import ru.uralsib.pages.components.SecondaryMenuComponent;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Data
public class PremiumPage {

    public SelenideElement
            vklady = $("a[href='/premium/vklady']"),
            creditCard = $("a[href='/premium/kreditnaya-karta']"),
            investicii = $("a[href='/premium/investicii']"),
            aktsii = $("a[href='https://www.uralsib.ru/aktsii?filters=premium']"),
            ipoteka = $("a[href='/premium/ipoteka']"),
            tabPrice = $(byText("Тарифы и документы")),
            priceAndDocs = $("a[href='https://www.uralsib.ru/api/directory-engine/files/rates/perechen-kodov-mcc_1q7wit8h.pdf']");
    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();

    @Step("Click on the 'Credit Card' button")
    public PremiumPage clickCreditCardButton() {
        getCreditCard().click();

        return this;
    }

    @Step("Verify: 'Premium' page is open")
    public void checkPremiumPageWasOpened() {
        getCreditCard().click();
    }

    @Step("Selecting the 'Tariffs and Documents' tab")
    public PremiumPage clickTabPriceAndDocs() {
        getTabPrice().click();

        return this;
    }

    @Step("Download the document 'List of MCC codes'")
    public File clickDocsMcc() {
        getPriceAndDocs().click();

        return downloadPriceCreditCard();
    }

    @Step("Download file")
    public File downloadPriceCreditCard() {
        try {
            return getPriceAndDocs().download();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Verify: the file has been downloaded")
    public void checkDownloadPriceCreditCard(String expectedResult, String actualResult) {
        assertEquals(expectedResult, actualResult);
    }
}