package ru.uralsib.ui.pages.personalPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

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


    @Step("main Page was opened")
    public void checkPersonalPageWasOpened() {
        getKredity().shouldHave(text("Кредиты"));
    }

    @Step("Open Debetovye-karty Page")
    public PersonalPage openDebetovyeKartyPage() {
        getDebetovyeKarty().click();

        return this;
    }

    @Step("Open ATM Page")
    public PersonalPage openAtmPage() {
        getOfficeAtm().click();

        return this;
    }
}