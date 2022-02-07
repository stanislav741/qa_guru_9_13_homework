package tests;

import org.junit.jupiter.api.Test;
import pageobjects.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AddToCartTests {

    @Test
    void addToCartMPB16() {
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
        $(byXpath("//div[@data-autom='mac-product-summary-16inch-better']")).shouldHave(text("512 GB SSD Speicher"));
        $(byXpath("//div[@data-autom='mac-product-summary-16inch-better']")).shouldHave(text("16\" Liquid Retina XDR Display"));

        $(byXpath("//button[@data-autom='proceed-16inch-better']")).click();

        ActionTray.actionTrayAddToCart();
        $(byXpath("//span[@data-autom='summaryHeaderTitle']")).shouldHave(text("16\" MacBook Pro – Space Grau"));
    }

    @Test
    void addToCartAirPods3() {
        Homepage.homepageOpen();

        Navbar.navbarSelectAirPods();
        $(".chapternav-item-airpods-3gen").shouldBe(visible);

        ChapterNav.chapterNavSelectAirPods3();
        $(byText("AirPods (3. Generation)")).shouldBe(visible);

    }
}
