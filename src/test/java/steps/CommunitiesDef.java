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
}
