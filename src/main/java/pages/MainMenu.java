package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class MainMenu {

    //User pages
    private static final SelenideElement Home = $(".mdc-list-item[data-id=\"menu.home\"]");
    private static final SelenideElement TasksUser = $(".mdc-list-item[data-id=\"menu.tasks\"]");
    /*private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");
    private static final SelenideElement Mobile = $("");*/

    //Management pages
    private static final SelenideElement MainConfiguration = $(".mdc-list-item[data-id=\"menu.management.main_configuration\"]");
    private static final SelenideElement Management = $(".mdc-list-item--with-icon[data-id=\"menu.management\"]");
    private static final SelenideElement Mobile = $("a[href=\"/management/parameters/mobile\"]");
    private static final SelenideElement ActivityDashboard = $("a[href=\"/management/activity_dashboard\"]");
    private static final SelenideElement Badges = $("a[href=\"/management/badge\"]");
    private static final SelenideElement CommunityGroup = $("a[href=\"/management/community_group\"]");
    private static final SelenideElement Communities = $("a[href=\"/management/communities\"]");
    private static final SelenideElement Tasks = $("a[href=\"/management/tasks\"]");
    private static final SelenideElement Users = $("a[href=\"/management/users\"]");
    private static final SelenideElement Roles = $("a[href=\"/management/role\"]");
    private static final SelenideElement Levels = $("a[href=\"/management/levels\"]");
    /*private static final SelenideElement Mobile = $("");
    /*private static final SelenideElement Mobile = $("");
    /*private static final SelenideElement Mobile = $("");
    /*private static final SelenideElement Mobile = $("");
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
    private static final SelenideElement Mobile = $("");*/

    public void openManagementCommunityGroup() {

        if (CommunityGroup.isDisplayed()) {

        }
        else {
            Management.click();
        }
        CommunityGroup.click();

    }

    public void openManagementCommunities() {

        if (Communities.isDisplayed()) {

        }
        else {
            Management.click();
        }
        Communities.click();

    }

    public void openManagementTasks() {

        if (Tasks.isDisplayed()) {

        }
        else {
            Management.click();
        }
        Tasks.click();

    }

    public void openMainConfigurationMobile() {

        if (Mobile.isDisplayed()) {

        }
        else if (Mobile.is(Condition.hidden) && MainConfiguration.isDisplayed()) {

            MainConfiguration.click();
        }
        else if (Mobile.is(Condition.hidden)) {

            Management.click();
            MainConfiguration.click();
        }
        Mobile.click();

    }

    public void openManagementBadges() {

        if (Badges.isDisplayed()) {

        }
        else {
            Management.click();
        }
        Badges.click();
    }
}
