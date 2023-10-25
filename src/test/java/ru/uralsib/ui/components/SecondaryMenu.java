package ru.uralsib.ui.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class SecondaryMenu {

    public SelenideElement
            personal = $("a[href='/']"),
            business = $("a[href='/business']"),
            privateBank = $("a[href='http://www.private-bank.ru/']"),
            premium = $("a[href='/premium']");
}
