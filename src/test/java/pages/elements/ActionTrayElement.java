package pages.elements;

import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class ActionTrayElement {

    @DisplayName("Click the purchase button on the bottom Action Tray")
    public static void actionTrayAddToCart() {
        $(by("data-autom", "addToCart")).click();
    }
}
