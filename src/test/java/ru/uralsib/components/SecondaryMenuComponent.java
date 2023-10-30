package ru.uralsib.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;
import org.aeonbits.owner.ConfigFactory;
import ru.uralsib.config.WebConfig;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class SecondaryMenuComponent {

    public SelenideElement
            personal = $("a[href='/']"),
            business = $("a[href='/business']"),
            privateBank = $("a[href='http://www.private-bank.ru/']"),
            premium = $("a[href='/premium']");
    WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    @Step("Открытие страницы 'Бизнесу'")
    public void openBusinessPage() {
        open("https://www.uralsib.ru/business");
    }

    @Step("Open Main Page")
    public void openMainPage() {
        open(config.getBaseUrl());
    }

    @Step("Open Premium Page")
    public void openPremiumPage() {
        open("https://www.uralsib.ru/premium");
    }
}
