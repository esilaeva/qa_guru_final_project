package ru.uralsib.ui.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;
import org.aeonbits.owner.ConfigFactory;
import ru.uralsib.config.WebConfig;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class PersonalPage {

    public SelenideElement
            kredity = $("a[href='/kredity']"),
            kreditnyeKarty = $("a[href='/kreditnye-karty']"),
            debetovyeKarty = $("a[href='/debetovye-karty']"),
            ipoteka = $("a[href='/ipoteka']"),
            vklady = $("a[href='/vklady']"),
            avtokredity = $("a[href='/avtokredity']"),
            investicii = $("a[href='/investicii']"),
            strakhovanie = $("a[href='/strakhovanie']"),
            mirSupreme = $("a[href='/mir-supreme']"),
            aktsii = $("a[href='/aktsii']"),
            officeAtm = $("a[href='/office-atm/atms/map']"),
            cards = $("div.BlockMenu___tagsContainer__8WHZe div").$(byText("Карты"));
    WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    @Step("Open Main Page")
    public PersonalPage openMainPage() {
        open(config.getBaseUrl());

        return this;
    }

    @Step("main Page was opened")
    public void checkPersonalPageWasOpened() {
        kredity.shouldHave(text("Кредиты"));
    }

    @Step("Open Debetovye-karty Page")
    public PersonalPage openDebetovyeKartyPage() {
        debetovyeKarty.click();

        return this;
    }

    @Step("Open ATM Page")
    public PersonalPage openAtmPage() {
        officeAtm.click();

        return this;
    }
}