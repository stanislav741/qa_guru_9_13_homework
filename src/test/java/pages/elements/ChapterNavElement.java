package pages.elements;

import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;

public class ChapterNavElement {

    //MBP means MacBook Pro
    @DisplayName("Select MacBook Pro from the Chapter Navbar")
    public static void chapterNavSelectMBP() {
        $(".chapternav-item-macbook-pro").click();
    }

    //MBP1416 means 14'' and 16'' MacBook Pro option
    @DisplayName("Select 14'' and 16'' MacBook Pro option from the Chapter Navbar")
    public static void chapterNavSelectMBP1416() {
        $(".chapternav-item-macbook-pro-14-and-16").click();
    }

    @DisplayName("Select AirPods 3. Generation option from the Chapter Navbar")
    public static void chapterNavSelectAirPods3() {
        $(".chapternav-item-airpods-3gen").click();
    }

}
