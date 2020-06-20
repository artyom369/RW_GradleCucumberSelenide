package steps;

import io.cucumber.java.en.Then;
import managementPages.CommunitiesPage;
import managementPages.CommunityGroupPage;
import pages.HomePage;
import pages.MainMenu;

public class CommunityGroupDef {

    MainMenu mainMenu = new MainMenu();
    HomePage homePage = new HomePage();
    CommunityGroupPage communityGroupPage = new CommunityGroupPage();
    CommunitiesPage communitiesPage = new CommunitiesPage();

    @Then("Title {string} visible")
    public void titleManageCommunityGroupsVisible(String text) {

        communityGroupPage.titleIsVisible(text);
    }

    @Then("Click Create Community Group button")
    public void clickCreateCommunityGroupButton() {

        communityGroupPage.clickCreateCommGroupButton();
    }

    @Then("Fill Title field")
    public void fillTitleField() {

        communityGroupPage.fillTitle("art");
    }

    @Then("Fill Description field")
    public void fillDescriptionField() {

        communityGroupPage.fillDescription("test");
    }

    @Then("Fill Sort Order field")
    public void fillSortOrderField() {

        communityGroupPage.setSortOrder("9");
    }

    @Then("Click {string}")
    public void click(String arg0) {

        communityGroupPage.clickSave();
    }

    @Then("Click Create Community button")
    public void clickCreateCommunityButton() {

        communitiesPage.clickCreateCommunityButton();

    }

    @Then("Open Community groups page")
    public void openCommunityGroupsPage() {

        mainMenu.openManagementCommunityGroup();

    }
}
