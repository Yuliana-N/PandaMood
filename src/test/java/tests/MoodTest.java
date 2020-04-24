package tests;

import org.testng.annotations.Test;

public class MoodTest extends BaseTest{
    @Test
    public void updateMoodTo10Test(){

        steps
                .login("ooprt@mailinator.com","password01")
                .updateMood(4,"","");

    }
}
