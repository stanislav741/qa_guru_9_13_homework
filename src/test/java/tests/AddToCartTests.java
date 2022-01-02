package tests;

import org.junit.jupiter.api.Test;
import pageobjects.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddToCartTests {

    @Test
    void addToCartMPB1416() {
        Homepage.homepageOpen();
        Navbar.navbarSelectMac();
        $(".chapternav-item-macbook-pro").shouldBe(visible);
        ChapterNav.chapterNavSelectMBP();
        $(".chapternav-item-macbook-pro-14-and-16").shouldBe(visible);
        ChapterNav.chapterNavSelectMBP1416();
        $(byText("14\" und 16\" Modelle")).shouldBe(visible);
        LocalNav.localNavPurchaseMBP1416();
        $(byText("Wähle dein neues MacBook Pro.")).shouldBe(visible);
        BundleSelection.bundleSelectMBP16();

    }


}
