package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.FeedPage;
import pages.MoodModal;
import steps.MoodSteps;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class BaseTest {
    MoodSteps steps;
    FeedPage feedPage;
    MoodModal moodModal;

    @BeforeClass
    public void setupBrowser() {
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        Configuration.headless = false;
    }

    @BeforeMethod
    public void openBrowser() {
        steps = new MoodSteps();
        feedPage = new FeedPage();
        moodModal = new MoodModal();

    }

    @AfterMethod
    public void closeBrowser() {
        getWebDriver().close();
    }
}
