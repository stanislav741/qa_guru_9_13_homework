package tests;

import org.junit.jupiter.api.Test;
import pages.*;
import pages.elements.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddToCartTests {

    @Test
    void addToCartMPB16() {
        HomePage.homepageOpen();

        Navbar.navbarSelectMac();
        $(".chapternav-item-macbook-pro").shouldBe(visible);

        ChapterNavElement.chapterNavSelectMBP();
        $(".chapternav-item-macbook-pro-14-and-16").shouldBe(visible);

        ChapterNavElement.chapterNavSelectMBP1416();
        $(byText("14\" und 16\" Modelle")).shouldBe(visible);

        LocalNavElement.localNavPurchaseMBP1416();
        $(byText("Wähle dein neues MacBook Pro.")).shouldBe(visible);

        BundleSelectionElement.bundleSelectMBP16();
        $(byXpath("//div[@data-autom='mac-product-summary-16inch-better']")).shouldHave(text("512 GB SSD Speicher"));
        $(byXpath("//div[@data-autom='mac-product-summary-16inch-better']")).shouldHave(text("16\" Liquid Retina XDR Display"));

        $(byXpath("//button[@data-autom='proceed-16inch-better']")).click();

        ActionTrayElement.actionTrayAddToCart();
        $(byXpath("//span[@data-autom='summaryHeaderTitle']")).shouldHave(text("16\" MacBook Pro – Space Grau"));
    }

    @Test
    void addToCartAirPods3() {
        HomePage.homepageOpen();

        Navbar.navbarSelectAirPods();
        $(".chapternav-item-airpods-3gen").shouldBe(visible);

        ChapterNavElement.chapterNavSelectAirPods3();
        $(byText("AirPods (3. Generation)")).shouldBe(visible);

        LocalNavElement.localNavPurchaseAirPods3();
        $(byText("AirPods im Detail.")).shouldBe(visible);

        $(by("data-autom", "add-to-cart")).click();
        $$(".rs-iteminfo-title").findBy(text("AirPods (3. Generation)")).shouldBe(visible);

    }
}
