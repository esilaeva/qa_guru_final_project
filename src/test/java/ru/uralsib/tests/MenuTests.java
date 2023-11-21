package ru.uralsib.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.uralsib.pages.components.SecondaryMenuComponent;

public class MenuTests extends TestBase {

    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();

    @CsvFileSource(resources = "/data.csv")
    @ParameterizedTest(name = "Open {0} page")
    public void openPagesTest(String namePage, String index, String element, String value) {
        secondaryMenuComponent.openPersonalPage();
        secondaryMenuComponent.openPage(element);

        secondaryMenuComponent.checkPageOpened(index, value);
    }
}