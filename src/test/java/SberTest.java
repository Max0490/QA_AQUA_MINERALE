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
    public void searchAtm() {
        open("http://www.sberbank.ru/ru/person");
        $(byLinkText("Банкоматы")).click();
        $(".kitt-input__control").setValue("60032100").pressEnter();
        $(".moib-card-address__address")
                .shouldHave(text("г. Вологда, ул. Пошехонское Шоссе, д. 21"));
    }

    @Test
    public void searchAnswerInFaq() {
        open("http://www.sberbank.ru/ru/person");
        $("#kitt-top-menu-11")
        $("")
    }

}
