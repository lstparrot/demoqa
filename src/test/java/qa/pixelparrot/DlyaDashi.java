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

public class DlyaDashi {

    @DisplayName("With love")
    @Test
    void selenideSearchTest() {
        Selenide.open("https://ya.ru");
        $("#text").setValue("Ты умничка, у тебя все получится:)");
        $("button[type='submit']").click();
        //Ex
        $$(".serp-item").find(Condition.text("Ты умничка, у тебя все получится:)")).shouldBe(Condition.visible);

    }
}

/*Тут хоть мысли можно выразить шушуть.
Жаль что я не такой красивый как хотелось бы.
Я почему то решил что чувства вызывает природа человека, а не внешние атрибуты.
Жаль что был не всегда уверен,
но принимал тяжелые решения.
Жаль что ты сказала что я найду лучше, после того как я уже сделал свой выбор.
Жизнь такая странная штука, движение сквозь боль.
Я так долго был один, что забыл о обычных проявлениях нежности и симпатии.
Я никогда не был слабым и обиженным на жизнь, я ее люблю и уважаю себя.
У меня горит сердце. Показательно то, как я
воспринимаю эту ситуацию, а были мы вместе так недолго.
Я пришел к неоднозначному выводу, я хочу быть ценным. Ценным и для себя, и для близких людей.
Жаль что не стал ценным
для тебя, как ты для меня.
Я не ищу жалости или поддержки, пройду это, как проходил уже сотню раз.
А увидеться я бы хотел потому что в голове у меня такая хуйня по планам, что хотелось бы просто живым остаться)
Воть
Я хз увидишь ты это или нет, но ты реально лучшая девушка в моей жизни, я в целом про отношение к жизни и цели.
И меня пугает то что найти такого человека у меня второй раз не получится, да и я не хочу больше этим заниматься.
В общем как то так, знаю что у тебя все будет хорошо, это меня успокаивает)
 */