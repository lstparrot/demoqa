package qa.pixelparrot;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void initDB(){
        System.out.println("### @BeforeAll");
    }


    @BeforeEach
    void openYaPage(){
        Selenide.open("https://ya.ru");

    }
    @AfterEach
    void close(){
        WebDriverRunner.closeWindow();
    }
    @AfterAll
    static void cleanDB(){
        System.out.println("### @BeforeAll");
    }

    @Test
    void assertTest(){
        Assertions.assertTrue(true);


    }

    @Test
    void assertTest2(){
        Assertions.assertTrue(true);
    }

}
