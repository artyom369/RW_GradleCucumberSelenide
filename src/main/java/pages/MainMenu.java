package pages;

import static com.codeborne.selenide.Selenide.$;

public class MainMenu {

    public void openManagementCommunityGroup() {

        //$(".mdc-list-item--with-icon[data-id=\"menu.management\"]").click();

        if ($(".mdc-list-item[data-id=\"label.community_groups\"]").isDisplayed()) {
        } else {
            $(".mdc-list-item--with-icon[data-id=\"menu.management\"]").click();
        }
        $(".mdc-list-item[data-id=\"label.community_groups\"]").click();

    }

    public void openManagementCommunities() {

        if ($(".mdc-list-item[data-id=\"label.communities\"]").isDisplayed()) {
        } else {
            $(".mdc-list-item--with-icon[data-id=\"menu.management\"]").click();
        }
        $(".mdc-list-item[data-id=\"label.communities\"]").click();

    }

    public void openManagementTasks() {

        if ($(".mdc-list-item[data-id=\"management_menu.tasks\"]").isDisplayed()) {
        } else {
            $(".mdc-list-item--with-icon[data-id=\"menu.management\"]").click();
        }
        $(".mdc-list-item[data-id=\"management_menu.tasks\"]").click();


    }
}
