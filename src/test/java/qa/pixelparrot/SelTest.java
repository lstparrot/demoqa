package qa.pixelparrot;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelTest {

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest(){
        String name = "Alex";
        open("/text-box");

        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue("alex@test.com");
        $("[id=currentAddress]").setValue("Street 1");
        $("[id=permanentAddress]").setValue("Street 2");
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text(name), text("Street 1"));

        $("[id=output] [id=name]").shouldHave(text(name));
        $("[id=output]").$("[id=name]").shouldHave(text(name));




    }




}
