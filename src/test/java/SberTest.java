import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SberTest {

    @Test
    public void openPage() {

        open("https://gitlab.com/rluna-gitlab/gitlab-ce");
        $(byLinkText("Pricing")).click();
    }

}
