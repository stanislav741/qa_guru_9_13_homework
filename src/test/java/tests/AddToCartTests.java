package tests;

import org.junit.jupiter.api.Test;
import pageobjects.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

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
        $(byXpath("//div[@data-autom='addToCart']")).click();
        $(byXpath("//div[@data-autom='add-to-cart']")).click();

    }


}
