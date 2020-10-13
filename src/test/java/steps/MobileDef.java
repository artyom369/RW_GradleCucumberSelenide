package steps;

import io.cucumber.java.en.Then;
import managementPages.mainConfiguration.MobilePage;
import pages.MainMenu;

public class MobileDef {

    MobilePage mobilePage = new MobilePage();
    MainMenu mainMenu = new MainMenu();

    @Then("Open Mobile page")
    public void openMobilePage() {

        mainMenu.openMainConfigurationMobile();
    }

    @Then("Setup Android version {string}")
    public void enterAndroidVersion(String arg0) {

        mobilePage.enterAndroidVersion(arg0);
    }


}
