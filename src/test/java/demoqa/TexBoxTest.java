package demoqa;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TexBoxTest  {

    @BeforeAll
    static void beforeAll(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1500x1000";
        Configuration.baseUrl = "http://uitestingplayground.com";
    }

    @Test
    void fillFormTest (){
        open("/textinput");
        $("h3").shouldHave(text("Text Input"));
        $("#updatingButton")
                .shouldHave(text("Button That Should Change it's Name Based on Input Value"));
        $("#newButtonName").setValue("BeeeButton");
        $("#updatingButton").click();
        $("#updatingButton").shouldHave(text("BeeeButton"));
        //todo something

    }


}
