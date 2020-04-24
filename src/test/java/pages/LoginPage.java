package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    String URL = "https://moodpanda.com/Login/";

    public LoginPage openPage() {
        open(URL);
        $("[alt='MoodPanda Android App on Google Play']").waitUntil(Condition.visible, 30000); //ждём пока открывается форма(гугл плэй кнопка)
        return this;
    }
    public LoginPage login(String user, String password) {
        $("#ContentPlaceHolderContent_TextBoxEmail").sendKeys(user); // # - потому что id - ишник
        sleep(1500);
        $(By.id("ContentPlaceHolderContent_TextBoxPassword")).sendKeys(password);
        $(By.id("ContentPlaceHolderContent_ButtonLogin")).click();
        return this;
    }

}
