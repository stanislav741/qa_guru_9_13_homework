package pages.elements;

import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;

public class Navbar {

    @DisplayName("Select Mac category from the Navbar")
    public static void navbarSelectMac() {
        $(".ac-gn-mac").click();
    }

    @DisplayName("Select AirPods category from the Navbar")
    public static void navbarSelectAirPods() {
        $(".ac-gn-airpods").click();
    }
}
