package steps;

import io.cucumber.java.en.Then;
import managementPages.CommunitiesPage;
import pages.MainMenu;

public class CommunitiesDef {

    MainMenu mainMenu = new MainMenu();
    CommunitiesPage communitiesPage = new CommunitiesPage();

    @Then("Open Communities page")
    public void openCommunitiesPage() {

        mainMenu.openManagementCommunities();
    }

    @Then("Choose Community group {string}")
    public void chooseCommunityGroup(String text) {

        communitiesPage.selectCommunityGroup(text);
    }

    @Then("Fill Community title {string}")
    public void fillCommunityTitle(String text) {

        communitiesPage.fillCommunityTitle(text);
    }
}
