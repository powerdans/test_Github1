
import com.codeborne.selenide.DragAndDropOptions;

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
    @Test
    void Moving() {
        open("drag_and_drop");
        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
        $("#column-a").shouldHave(text("B"));
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
    }

}
