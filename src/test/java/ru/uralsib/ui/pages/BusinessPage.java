package ru.uralsib.ui.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class BusinessPage {

    public SelenideElement
            rko = $("a[href='/business/rko']"),
            finansirovanie = $("a[href='/business/finansirovanie']"),
            corporateCard = $("a[href='/business/corporate-card']"),
            ekvayring = $("a[href='/business/ekvayring']"),
            ved = $("a[href='/business/ved']"),
            zarplatniyProekt = $("a[href='/business/zarplatniy-proekt']"),
            depozity = $("a[href='/business/depozity']"),
            uralsibDelo = $("a[href='/business/uralsib-delo']"),
            regBussiness = $("a[href='https://reg.uralsib.ru/?utm_source=site_nav']");


    public BusinessPage openBusinessPage() {
        open("https://www.uralsib.ru/business");

        return this;
    }

    public BusinessPage clickDepositButton() {
        ved.click();

        return this;
    }
}