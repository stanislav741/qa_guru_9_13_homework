package pages.elements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class BundleSelectionElement {

    //MBP16 is 16'' MacBook Pro
    public static void bundleSelectMBP16() {
        $$(".rs-bundleselection-tabnav-items button").findBy(text("16 Zoll")).click();
    }

}
