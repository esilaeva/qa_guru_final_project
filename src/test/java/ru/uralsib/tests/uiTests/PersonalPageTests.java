package ru.uralsib.tests.uiTests;

import org.junit.jupiter.api.Test;
import ru.uralsib.tests.TestBase;
import ru.uralsib.ui.pages.PersonalPage;
import ru.uralsib.ui.pages.personal.AtmPage;
import ru.uralsib.ui.pages.personal.DebetovyeKartyPage;

public class PersonalPageTests extends TestBase {

    PersonalPage personal = new PersonalPage();
    DebetovyeKartyPage debKarty = new DebetovyeKartyPage();
    AtmPage listAtm = new AtmPage();

    @Test
    public void checkPersonalButton() {
        personal
                .openMainPage()
                .checkPersonalPageWasOpened();
    }

    @Test
    public void checkDebKartyButton() {
        personal
                .openMainPage()
                .openDebetovyeKartyPage();

        debKarty.checkDebKartyPageWasOpened();
    }

    @Test
    public void checkAtmButton() {
        personal
                .openMainPage()
                .openAtmPage();

        listAtm.checkAtmPageWasOpened();
    }
}
