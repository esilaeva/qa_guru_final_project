package ru.uralsib.tests.uiTests;

import org.junit.jupiter.api.Test;
import ru.uralsib.tests.TestBase;
import ru.uralsib.ui.pages.BusinessPage;
import ru.uralsib.ui.pages.PersonalPage;
import ru.uralsib.ui.pages.business.Ved;

public class BusinessTests extends TestBase {

    PersonalPage personal = new PersonalPage();
    BusinessPage business = new BusinessPage();
    Ved ved = new Ved();

    @Test
    public void checkDepositPageWasOpened() {
        business
                .openBusinessPage()
                .clickDepositButton();
        ved.checkVedTitle();
    }
}
