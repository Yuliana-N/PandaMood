package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class MoodModal {

    String UPDATE_BUTTON_CSS = ".ButtonUpdate"; //class
    String MY_DIARY_BUTTON_CSS = ".ButtonMyDiary"; //class

    public MoodModal isPageOpened(){
        $(UPDATE_BUTTON_CSS).should(Condition.appear);
        return this;
    }
    public MoodModal updateDetails(int moodRating, String description, String date){
        //TODO set mood Rating
        $("#TextBoxUpdateMoodTag").sendKeys(description);
        return this;

    }
    public MoodModal clickUpdateMood(){
        $(UPDATE_BUTTON_CSS).click();
        return this;

    }
    public void toDiary(){
        $(MY_DIARY_BUTTON_CSS).click();
    }
}

