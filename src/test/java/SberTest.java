import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SberTest {

    @Test
    public void openPage() {

        open("http://www.sberbank.ru/ru/person");
        $(byLinkText("Офисы")).click();
    }

}
