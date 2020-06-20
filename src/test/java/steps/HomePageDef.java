package steps;

import io.cucumber.java.en.Then;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.*;



public class HomePageDef {

    HomePage homePage = new HomePage();

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {

    }

    @Then("Open {string} page")
    public void openPage(String arg0) {

        open(arg0);
    }

}
