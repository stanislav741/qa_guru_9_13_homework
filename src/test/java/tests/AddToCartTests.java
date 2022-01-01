package tests;

import org.junit.jupiter.api.Test;
import pageobjects.Homepage;
import pageobjects.Navbar;

public class AddToCartTests {

    @Test
    void addToCart() {
        Homepage.homepageOpen();
        Navbar.navbarSelectMac();
    }
}
