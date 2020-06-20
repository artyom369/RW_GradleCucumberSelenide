package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private SelenideElement emailField = $(By.id("username"));
    private SelenideElement passwordField = $(By.id("password"));

    public void inputEmail(String text) {

        this.emailField.val(text);
    }

    public void inputPassword(String text) {

        this.passwordField.val(text);
    }

    public void clickButton(String text) {

        $(By.cssSelector("input[type='submit']")).click();
    }
}
