package ru.uralsib.ui.pages.premiumPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;
import ru.uralsib.ui.components.SecondaryMenuComponent;

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
            priceCreditCardPremium = $("a[href='https://www.uralsib.ru/api/directory-engine/files/rates/premial_credcard_200923_5akcgurx.pdf']");
    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();

    @Step("Нажатие на кнопку 'Кредитная карта'")
    public PremiumPage clickCreditCardButton() {
        getCreditCard().click();

        return this;
    }

    @Step("Проверка: страница 'Premium' открыта")
    public void checkPremiumPageWasOpened() {
        getCreditCard().click();
    }

    @Step("Выбор вкладки 'Тарифы и документы'")
    public PremiumPage clickTabPrice() {
        getTabPrice().click();

        return this;
    }

    @Step("Загрузка прайс-листа тарифа 'Кредитная карта с набором услуг Премиальный'")
    public File clickPriceCreditCard() {
        getPriceCreditCardPremium().click();

        return downloadPriceCreditCard();
    }

    @Step("Загрузка файла")
    public File downloadPriceCreditCard() {
        try {
            return getPriceCreditCardPremium().download();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Проверка: файл был скачан")
    public void checkDownloadPriceCreditCard(String expectedResult, String actualResult) {
        assertEquals(expectedResult, actualResult);
        //delete
    }
}