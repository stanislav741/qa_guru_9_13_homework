package pageobjects;

import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LocalNav {

    //MBP1416 means 14'' and 16'' MacBook Pro option
    @DisplayName("Click the purchase button for 14'' and 16'' MacBook Pro option")
    public static void localNavPurchaseMBP1416() {
        $(byXpath("//*[@id='ac-localnav']//a[@href='/de/shop/goto/buy_mac/macbook_pro_14']")).click();
    }
}
