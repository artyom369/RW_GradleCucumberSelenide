package steps;

import io.cucumber.java.en.Then;
import pages.MainMenu;

public class TasksDef {

    MainMenu mainMenu = new MainMenu();

    @Then("Open Tasks page")
    public void openTasksPage() {

        mainMenu.openManagementTasks();
    }
}
