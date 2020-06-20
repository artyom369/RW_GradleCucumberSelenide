package managementPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;

public class CommunitiesPage {

    public void titleIsVisible() {

        $(".management__title").shouldBe(Condition.visible);
    }

    // Create Community page
    public void clickCreateCommunityButton() {

        $(".controls__item[href=\"/management/communities/create\"]").click();
    }

    public void fillCommunityTitle(String text) {

        $("#community_title").val(text);
    }

    public void selectCommunityGroup(String text) {

        //Select communityGroup = new Select($("#community_communityGroup"));
        //communityGroup.selectByVisibleText(text);

        $("#community_communityGroup").selectOptionContainingText(text);
    }
}
