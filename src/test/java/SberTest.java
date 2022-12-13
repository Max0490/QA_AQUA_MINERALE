import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SberTest {

//    @Test
//    public void openPage() {
//
//        open("http://www.sberbank.ru/ru/person");
//        $(".kitt-header__sbol").shouldHave(text("СберБанк Онлайн"));
//    }
//
//    @Test
//    public void searchAtm() {
//        open("http://www.sberbank.ru/ru/person");
//        $(byLinkText("Банкоматы")).click();
//        $(".kitt-input__control").setValue("60032100").pressEnter();
//        $(".moib-card-address__address")
//                .shouldHave(text("г. Вологда, ул. Пошехонское Шоссе, д. 21"));
//    }
//
//    @Test
//    public void searchOffice() {
//        open("http://www.sberbank.ru/ru/person");
//        $(byLinkText("Офисы")).click();
//        $(".kitt-input__control").setValue("6991/0146").pressEnter();
//        $(".moib-card-address__address")
//                .shouldHave(text("г. Самара, пр-кт Металлургов,  67"));
//    }
//
//    @Test //тест поиска вопроса-ответа в FAQ
//    public void searchAnswerInFaq() {
//        open("http://www.sberbank.ru/ru/person");
//        $("#kitt-top-menu-11")
//        $("")
//    }

    @Test  //тест поиска вакансии
    public void searchVacancy() {
        open("http://www.sberbank.ru/ru/person");
        $(byLinkText("Вакансии")).click();
        $(byText("Профессия, навык или сфера"))
                .setValue("Java").pressEnter();
        $$(".Box-sc-159i47a-0").first().click();
        $("#__next").shouldHave(text("Java"));
    }

    @Test //проверка локали
    public void switchToEnglishVersion() {
        open("http://www.sberbank.ru/ru/person");
        $(byLinkText(".kitt-footer-lang_md")).click();
        $("#PageTeaserDict_header").shouldHave(text("SberBank today"))
    }

}
