package qa.pixelparrot;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelTest {

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest(){
        open("/text-box");

        $("[id=userName]").setValue("Alex");
        $("[id=userEmail]").setValue("alex@test.com");
        $("[id=currentAddress]").setValue("Street 1");
        $("[id=permanentAddress]").setValue("Street 2");
        $("[id=submit]").click();




    }




}
