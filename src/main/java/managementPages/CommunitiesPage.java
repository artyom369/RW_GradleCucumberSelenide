package managementPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CommunitiesPage {

    public void titleIsVisible() {

        $(".management__title").shouldBe(Condition.visible);
    }

    // Create Community page
    public void clickCreateCommunityButton() {

        $(".controls__item[href=\"/management/communities/create\"]").click();
    }
}
