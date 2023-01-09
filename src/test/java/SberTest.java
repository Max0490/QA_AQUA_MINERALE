import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SberTest {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "http://www.sberbank.ru";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

//    @Test
//    @DisplayName("Открытие главной страницы")
//    public void openPage() {
//
//        open("/ru/person");
//        $(".kitt-header__sbol").shouldHave(text("СберБанк Онлайн"));
//    }
//
//    @Test
//    @DisplayName("Проверка поиска банкомата по номеру")
//    public void searchAtm() {
//        open("/ru/person");
//        $(byLinkText("Банкоматы")).click();
//        $(".kitt-input__control").setValue("60032100").pressEnter();
//        $(".moib-card-address__address")
//                .shouldHave(text("г. Вологда, ул. Пошехонское Шоссе, д. 21"));
//    }
//
//    @Test
//    @DisplayName("Проверка поиска доп.офиса банка по номеру")
//    public void searchOffice() {
//        open("/ru/person");
//        $(byLinkText("Офисы")).click();
//        $(".kitt-input__control").setValue("6991/0146").pressEnter();
//        $(".moib-card-address__address")
//                .shouldHave(text("г. Самара, пр-кт Металлургов,  67"));
//    }
//
//    @Test //тест поиска вопроса-ответа в FAQ
//    public void searchAnswerInFaq() {
//        open("/ru/person");
//        $("#kitt-top-menu-11")
//        $("")
//    }

    @Test  //тест поиска вакансии
    @DisplayName("Проверка поиска вакансии по ключевому слову")
    public void searchVacancy() {
        open("/ru/person");
        $(byLinkText("Вакансии")).click();
        $(byText("Профессия, навык или сфера"))
                .setValue("Java").pressEnter();
        $$(".Box-sc-159i47a-0").first().click();
        $("#__next").shouldHave(text("Java"));
    }

    @Test //проверка локали
    @DisplayName("Проверка изменения языка на сайте")
    public void switchToEnglishVersion() {
        open("/ru/person");
        $(byLinkText(".kitt-footer-lang_md")).click();
        $("#PageTeaserDict_header").shouldHave(text("SberBank today"));
    }

}
