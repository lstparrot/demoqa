package qa.pixelparrot.docs;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTest {
    @Disabled
    @DisplayName("Web Test")
    @Test
    void selenideSearchTest(){
        //Pre-c
        Selenide.open("https://ya.ru");
        //Steps
        $("#text").setValue("Selenide");
        $("button[type='submit']").click();
        //Ex
        $$(".serp-item").find(Condition.text("Selenide")).shouldBe(Condition.visible);
    }

   // @DisplayName("Parametrized test")
    @ValueSource(strings =
            {
                "Selenide", "JUnit"
            }
    )
    @ParameterizedTest(name = "Parameterized test {0}")
    void yaParTest(String testData){
        //Pre-c
        Selenide.open("https://ya.ru");
        //Steps
        $("#text").setValue(testData);
        $("button[type='submit']").click();
        //Ex
        $$(".serp-item").find(Condition.text(testData)).shouldBe(Condition.visible);
    }
}
