package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageDef {

    LoginPage loginPage = new LoginPage();

    @Then("Input email")
    public void inputEmail() {

        loginPage.inputEmail(UserConfig.ADMIN_EMAIL);
    }

    @Then("Input password")
    public void inputPassword() {

        loginPage.inputPassword(UserConfig.ADMIN_PASSWORD);
    }

    @Then("Click {string} button")
    public void clickButton(String arg0) {

        loginPage.clickButton(arg0);
    }
}
