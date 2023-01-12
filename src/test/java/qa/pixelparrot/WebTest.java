package qa.pixelparrot;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.commands.Click;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import qa.pixelparrot.domain.MenuItem;

import java.util.List;
import java.util.stream.Stream;

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

    @CsvSource({
            "one, two",
            "tree, four"
    }

    )
    @ParameterizedTest(name = "Parameterized test {0}, second result{1}")
    void yaParTestSecond(String testData, String testDataSecond){
        //Pre-c
        Selenide.open("https://ya.ru");
        //Steps
        $("#text").setValue(testData);
        $("button[type='submit']").click();
        //Ex
        $$(".serp-item").find(Condition.text(testData)).shouldBe(Condition.visible);
    }


    static Stream<Arguments> methodSourceExTt(){
        return Stream.of(
                Arguments.of("first string", List.of(42, 13)),
                Arguments.of("second string", List.of(1, 2))
        );
    }

    @MethodSource("methodSourceExTt")
    @ParameterizedTest
    void methodSourceExTt(String first, List<Integer> second){
        System.out.println(first + second);
    }

    @EnumSource(MenuItem.class)
    @ParameterizedTest()
    void yaSeMeTt(MenuItem testData){
        //Pre-c
        Selenide.open("https://ya.ru");
        //Steps
        $("#text").setValue("Pictures");
        $("button[type='submit']").click();
        //Ex
        $$(".navigation__item")
                .find(Condition.text(testData.rusName))
                .click();

        Assertions.assertEquals(
                2,
                WebDriverRunner.getWebDriver().getWindowHandles().size()
        );
    }
        @AfterEach
    void close(){
        Selenide.closeWebDriver();
        }

}