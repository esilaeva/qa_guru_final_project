package ru.uralsib.ui.pages.personal;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class PremiumPage {

    public SelenideElement
            vklady = $("a[href='/premium/vklady']"),
            kreditnayaKarta = $("a[href='/premium/kreditnaya-karta']"),
            investicii = $("a[href='/premium/investicii']"),
            aktsii = $("a[href='https://www.uralsib.ru/aktsii?filters=premium']"),
            ipoteka = $("a[href='/premium/ipoteka']");
}