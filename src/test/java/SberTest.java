import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SberTest {

    @Test
    public void openPage() {

        open("http://www.sberbank.ru/ru/person");
        $(".kitt-header__sbol").shouldHave(text("СберБанк Онлайн"));
        //$(byLinkText("Офисы")).click();
    }

    @Test
    public void searchOffice() {
        open("http://www.sberbank.ru/ru/person");
        $(byLinkText("Офисы")).click();
    }

}
