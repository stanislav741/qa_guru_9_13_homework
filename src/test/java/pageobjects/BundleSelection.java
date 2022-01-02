package pageobjects;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BundleSelection {

    //MBP16 is 16'' MacBook Pro
    public static void bundleSelectMBP16() {
        $(byXpath("//*[@class='rs-bundleselection-tabnav-items']//button[text()='16 Zoll']")).click();
    }

}
