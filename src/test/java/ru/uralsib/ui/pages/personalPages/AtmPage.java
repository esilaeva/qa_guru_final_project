package ru.uralsib.ui.pages.personalPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Data;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Data
public class AtmPage {

    public SelenideElement
            listAtm = $("ymaps"),
            btnTerminals = $("div.DesktopSwitcher___wrapper__HESOH").lastChild(),
//            btnTerminals = $("label input[value='terminals']"),
            lblNearestTerminals = $(byText("Ближайшие терминалы банка:")),
            btnFilters = $(byText("Фильтры")),
            displayList = $("label").$(byText("Списком")),
          //  filterAlfaBank = $(byText("Альфа-Банк")),
            btnShow = $(byText("Показать")),
            atmPartner = $("dif[pointstype='atms'] div div.PointAtmsListItem___heading__cbnAJ");

    @Step("Проверка: карта с банкоматами открылась")
    public void checkAtmPageWasOpened() {
        getListAtm().shouldBe(appear);
    }

    @Step("Открытие фильтров")
    public AtmPage clickBtnFilters() {
        getBtnFilters().click();

        return this;
    }

    @Step("Выбор фильтра: банкоматы Альфа-банка")
    public AtmPage clickBtnFiltersAlfaBank() {
       getBtnFilters().click();

       return this;
    }

    @Step("Выбор терминалов")
    public AtmPage clickBtnTeminals() {
       getBtnTerminals().click();

       return this;
    }

    @Step("Отображение списком")
    public AtmPage clickDisplayList() {
       getDisplayList().click();

       return this;
    }

    @Step("Отображение результата выбранного фильтра")
    public AtmPage clickBtnShow() {
        getBtnShow().click();

        return this;
    }

    @Step("Проверка: банкоматы Альфа-банка видны")
    public void checkDisplayAtmAlfaBank(String value) {
        getAtmPartner().shouldHave(text(value));
    }

    @Step("Проверка: список ближайших терминалов банка отображается")
    public void checkDisplayTerminals() {
        getLblNearestTerminals().shouldBe(appear);
    }
}