package pages;

import org.junit.jupiter.api.DisplayName;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

   static String url = "https://www.apple.com/de/";

   @DisplayName("Open the main page")
   public static void homepageOpen() {
        open(url);
   }

}
