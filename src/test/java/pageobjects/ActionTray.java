package pageobjects;

import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ActionTray {

    @DisplayName("Click the purchase button on the bottom Action Tray")
    public static void actionTrayAddToCart() {
        $(byXpath("//div[@data-autom='addToCart']")).click();
    }
}
