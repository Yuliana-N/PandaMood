package steps;

import io.qameta.allure.Step;
import pages.FeedPage;
import pages.LoginPage;
import pages.MoodModal;

public class MoodSteps {
    LoginPage loginPage;
    FeedPage feedPage;
    MoodModal moodModal;

    public MoodSteps() {
        loginPage = new LoginPage();
        feedPage = new FeedPage();
        moodModal = new MoodModal();
    }
    @Step
    public MoodSteps login(String user, String password) {
        loginPage.openPage();
        loginPage.login(user, password);
        feedPage.isPageOpened();
        return this;
    }
    @Step
    public MoodSteps updateMood(int moodRating, String description, String date) {
        feedPage.clickUpdate();
        moodModal.isPageOpened();
        moodModal.updateDetails(moodRating,description,date);
        moodModal.clickUpdateMood();
        moodModal.toDiary();
        //TODO validate that Diary page is opened
        return this;
    }
}
