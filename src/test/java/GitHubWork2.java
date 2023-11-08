
import com.codeborne.selenide.DragAndDropOptions;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.*;


public class GitHubWork2 {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.pageLoadStrategy = "eager";
    }
    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }

    @Test
    void Moving() {
        open("drag_and_drop");
        $("#column-b").shouldHave(text("B"));
        $("#column-a").shouldHave(text("A"));
        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").shouldHave(text("A"));
    }

    @Test
            void Moving2()
        {
            $("#column-b").shouldHave(text("B"));
            $("#column-a").shouldHave(text("A"));
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
            $("#column-b").shouldHave(text("B"));
            $("#column-a").shouldHave(text("A"));
    }

}
