import org.junit.jupiter.api.Test;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class GitGubWork {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x1080";
        Configuration.baseUrl = "https://github.com/";
        Configuration.pageLoadStrategy = "eager";



    }

    @Test
    void Github() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $("[href=\"/enterprise\"]").shouldHave(text("Enterprise"));
        $("[href=\"/enterprise\"]").shouldHave(text("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered"));


    }
}

