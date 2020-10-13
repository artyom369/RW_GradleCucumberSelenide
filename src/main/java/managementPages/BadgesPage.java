package managementPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class BadgesPage {

    public void clickCreateBadge() {

        $("a[href=\"/management/badge/create\"]").click();
    }

    //Create badge page
    public void fillTitle(String text) {

        $("#badge_title").val(text);
    }

    public void fillLockedDescription(String text) {

        switchTo().frame($("#badge_lockedDescription_ifr"));
        $("body").sendKeys(text);
        switchTo().defaultContent();

    }

    public void fillUnlockedDescription(String text) {

        switchTo().frame($("#badge_unlockedDescription_ifr"));
        $("body").sendKeys(text);
        switchTo().defaultContent();

        //String x = $("html").innerText();

        //System.out.print(x);


    }
}
