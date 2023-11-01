package ru.uralsib.pages.businessPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

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
            regBussiness = $("a[href='https://reg.uralsib.ru/?utm_source=site_nav']"),
            price = $("nav li div"),
            serviceConditions = $(byText("Условия обслуживания для коммерческих организаций")),
            bigOrganization = $("div").$(byText("Организациям свыше 30 человек")),
            messagePrice = $("h3.Typography___Typography__zF6fJ").$(byText("Индивидуальный тариф")),
            bntMakeRequest = $("div.zarplatniy-proekt___buttonContainer__WP2Iq div button");

    @Step("Click on the 'VED' button")
    public BusinessPage clickVedButton() {
        getVed().click();

        return this;
    }

    @Step("Click on the 'Salary projects' button")
    public BusinessPage clickSalaryProjectsButton() {
        getZarplatniyProekt().click();

        return this;
    }

    @Step("Click on the 'Price' button")
    public BusinessPage clickPriceButton() {
        getPrice().click();

        return this;
    }

    @Step("Click on the 'Organizations over 30 people' button")
    public BusinessPage clickBigOrganizationButton() {
        getServiceConditions().shouldBe(appear);
        getBigOrganization().click();

        return this;
    }

    @Step("Verify: the 'Complete application' button appears")
    public void checkBntMakeRequestExists() {
        getBntMakeRequest().shouldBe(appear);
    }
}