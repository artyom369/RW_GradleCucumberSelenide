package managementPages.mainConfiguration;

import static com.codeborne.selenide.Selenide.$;

public class MobilePage {

    public void enterAndroidVersion(String text) {

        $("#mobile_version_android_value").clear();
        $("#mobile_version_android_value").val(text);
        $("#mobile_version_android_save").click();
    }
}
