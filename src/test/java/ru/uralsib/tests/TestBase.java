package ru.uralsib.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.Data;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.uralsib.config.WebConfig;
import ru.uralsib.config.WebProvider;
import ru.uralsib.helpers.Attach;
import ru.uralsib.components.SecondaryMenuComponent;
import ru.uralsib.pages.businessPages.BusinessPage;
import ru.uralsib.pages.businessPages.VedPage;
import ru.uralsib.pages.personalPages.DebetovyeKartyPage;
import ru.uralsib.pages.personalPages.InvesticiiPage;
import ru.uralsib.pages.personalPages.IszhPage;
import ru.uralsib.pages.personalPages.PersonalPage;
import ru.uralsib.pages.premiumPages.PremiumPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@Data
public class TestBase {

    SecondaryMenuComponent secondaryMenuComponent = new SecondaryMenuComponent();
    PersonalPage personalPage = new PersonalPage();
    DebetovyeKartyPage debKarty = new DebetovyeKartyPage();
    InvesticiiPage investiciiPage = new InvesticiiPage();
    IszhPage iszhPage = new IszhPage();

    PremiumPage premiumPage = new PremiumPage();

    BusinessPage businessPage = new BusinessPage();
    VedPage vedPage = new VedPage();

    protected static final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    @BeforeAll
    static void beforeAll() {
        WebProvider webProvider = new WebProvider(config);
        webProvider.webConfiguration();
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}