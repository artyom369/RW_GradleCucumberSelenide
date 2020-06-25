package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainMenu {

    private static final SelenideElement MainConfiguration = $(".mdc-list-item[data-id=\"menu.management.main_configuration\"]");
    private static final SelenideElement Management = $(".mdc-list-item--with-icon[data-id=\"menu.management\"]");
    private static final SelenideElement Mobile = $("a[href=\"/management/parameters/mobile\"]");
    /*private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");*/

    public void openManagementCommunityGroup() {

        //$(".mdc-list-item--with-icon[data-id=\"menu.management\"]").click();

        if ($(".mdc-list-item[data-id=\"label.community_groups\"]").isDisplayed()) {
        } else {
            Management.click();
        }
        $(".mdc-list-item[data-id=\"label.community_groups\"]").click();

    }

    public void openManagementCommunities() {

        if ($(".mdc-list-item[data-id=\"label.communities\"]").isDisplayed()) {
        } else {
            Management.click();
        }
        $(".mdc-list-item[data-id=\"label.communities\"]").click();

    }

    public void openManagementTasks() {

        if ($(".mdc-list-item[data-id=\"management_menu.tasks\"]").isDisplayed()) {
        } else {
            Management.click();
        }
        $(".mdc-list-item[data-id=\"management_menu.tasks\"]").click();


    }


    public void openMainConfigurationMobile() {

        if (Mobile.isDisplayed()) {

            Mobile.click();
        }
        else if (Mobile.is(Condition.hidden) && MainConfiguration.is(Condition.hidden)) {

            Management.click();
            MainConfiguration.click();
            Mobile.click();

        }
        else if(Mobile.is(Condition.hidden) && MainConfiguration.isDisplayed()) {

            MainConfiguration.click();
            Mobile.click();
        }

    }
}
