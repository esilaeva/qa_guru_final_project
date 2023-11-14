package ru.uralsib.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.uralsib.annotations.JiraIssue;
import ru.uralsib.annotations.JiraIssues;
import ru.uralsib.annotations.Manual;

import static io.qameta.allure.Allure.step;


@Manual
@Owner("Elena")
public class ManualTests {

    @Test
    @Tag("manual")
    @DisplayName("Manual test. Open 'Debit Cards' page")
    public void manualCheckDebitCardsButton() {
        step("Open 'Personal' page");
        step("Open the 'Debit Cards' Page");
        step("Verify: 'Debit Cards' page is open");
    }

    @Test
    @Tag("manual")
    @DisplayName("Manual test. Appearance of the 'Double cashback' button")
    public void manualCheckFaqWasShowed() {
        step("Open 'Personal' page");
        step("Selecting the Premium card", () -> {
            step("Open the 'Debit Cards' page");
            step("Selecting 'Debit cards' -> 'Premium'");
        });
        step("Verify: the 'Double cashback' button appeared");
    }

    @Test
    @Tag("manual")
    @DisplayName("Manual test. A request for consultation has appeared")
    public void manualCheckInvestments() {
        step("Open 'Personal' page");
        step("Leave a request for a consultation", () -> {
            step("Open the 'Investments' page");
            step("Click 'More details' button");
            step("Click 'Submit your application' button");
        });
        step("Verify: a request for consultation has appeared");
    }

    @Test
    @Tag("manual")
    @DisplayName("Manual test. Selecting a salary project")
    public void manualCheckBusinessCardPageWasOpened() {
        step("Open 'Business' page");
        step("Select a salary project for an organization of more than 30 people", () -> {
            step("Click on the 'Salary projects' button");
            step("Click on the 'Price' button");
            step("Click on the 'Organizations over 30 people' button");
        });
        step("Verify: the 'Complete application' button appears");
    }

    @Test
    @Tag("manual")
    @JiraIssues({@JiraIssue("HOMEWORK-928")})
    @DisplayName("Manual test. Download the document 'List of MCC codes'")
    public void manualDownloadPremiumPriceTest() {
        step("Open 'Premium' page");
        step("Download the document 'List of MCC codes'", () -> {
            step("Click on the 'Credit Card' button");
            step("Selecting the 'Tariffs and Documents' tab");
            step("Download the file");
        });
        step("Verify: the file has been downloaded");
    }
}