package steps;

import io.cucumber.java.en.Then;
import managementPages.BadgesPage;
import pages.MainMenu;

public class BadgesDef {

    MainMenu mainMenu = new MainMenu();
    BadgesPage badgesPage = new BadgesPage();

    @Then("Open Badges Page")
    public void openBadgesPage() {

        mainMenu.openManagementBadges();

    }

    @Then("Click Create badge Button")
    public void clickCreateBadgeButton() {

        badgesPage.clickCreateBadge();

    }

    @Then("Enter {string} to title of badge")
    public void enterToTitleOfBadge(String arg0) {

        badgesPage.fillTitle(arg0);
    }

    @Then("Enter {string} to Locked Description field")
    public void fillLockedDescription(String text) {

        badgesPage.fillLockedDescription(text);

    }

    @Then("Enter {string} to Unlocked Description field")
    public void fillUnlockedDescription(String text) {

        badgesPage.fillUnlockedDescription(text);
    }


}
