package managementPages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CommunityGroupPage {

    public void titleIsVisible(String text) {

       // $(".management__title").shouldBe(Condition.visible);
        $(By.xpath("//div[contains(text(),'" + text + "')]")).shouldBe(Condition.visible);
    }

    public void clickCreateCommGroupButton() {

        $("a[href=\"/management/community_group/create\"]").click();
    }

    // Create Community Group page

    private SelenideElement title = $("#community_group_title");
    private SelenideElement description = $("#community_group_description");
    private SelenideElement sortOrder = $("#community_group_sortOrder");
    private SelenideElement saveButton = $(".btn-primary");

    public void fillTitle(String text) {

        this.title.val(text);
    }
    public void fillDescription(String text) {

        this.description.val(text);
    }
    public void setSortOrder(String text) {

        this.sortOrder.clear();
        this.sortOrder.val(text);
    }
    public void clickSave() {

        this.saveButton.click();
    }
}
