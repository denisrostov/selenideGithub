package github;

import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionTest {
    @Test
    void shouldFindSoftAssertion() {
        // открыть страничку гитхаб
        open("https://github.com/selenide/selenide/");
        $(byText("Wiki")).click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("JUnit5 extension"));


    }
}
