package pageobjects;

import org.junit.jupiter.api.DisplayName;
import static com.codeborne.selenide.Selenide.open;

public class Homepage {

   static String url = "https://www.apple.com/de/";

   @DisplayName("Open the main page")
   public static void homepageOpen() {
        open(url);
   }

}
